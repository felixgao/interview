package com.felix.interview.leetcode.hard.array;

import java.util.Stack;

/**
 * Created by felix on 2/8/17.
 * 84
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights == null) return 0;
        Stack<Integer> positionStack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i <= heights.length; i++){
            //if we are at the last element force the computation of area with index 0 of the array to capture last element of the
            //histogram is higher than previous
            int h = (i == heights.length ? 0 : heights[i]);
            if(positionStack.empty() || h >= heights[positionStack.peek()]){
                positionStack.push(i);
            } else {
                int lastPosition = positionStack.pop();
                maxArea = Math.max(maxArea,
                        heights[lastPosition] *
                                //if stack is empty then all of the bars up to i needs to be counted
                                (positionStack.isEmpty() ? i :
                                // i - 1 for the last position of the bar
                                // minus the current last highest bar position to find out how many bars we can use
                                // to compute the area with the least amount of height.
                                    i - 1 - positionStack.peek()
                                )
                );
                i--; // to compensate for i++ in the for loop. keep pop the position stack if the current value
                // of i is < than the top of the stack
            }
        }
        return maxArea;
    }
}
