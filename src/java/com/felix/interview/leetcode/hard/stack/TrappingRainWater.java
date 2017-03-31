package com.felix.interview.leetcode.hard.stack;

/**
 * Created by felix on 3/11/17.
 * https://leetcode.com/problems/trapping-rain-water/?tab=Description
 * 42
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length -1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while(left <= right){
            //iterate left boundary
            if(height[left] <= height[right] ){
                if(height[left] >= maxLeft) maxLeft = height[left];
                else res += maxLeft - height[left];
                left++;
            } else {
                if(height[right] >= maxRight) maxRight = height[right];
                else res += maxRight - height[right];
                right--;
            }
        }
        return res;
    }
}
