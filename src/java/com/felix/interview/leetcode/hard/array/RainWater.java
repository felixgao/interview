package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/8/17.
 */
public class RainWater {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int water = 0;
        int maxLeftHeight = 0, maxRightHeight = 0;

        while(left <= right){
            //we have a trap on the left of the wall from the right ex.
            // | water ||         where || is higher than |
            if(height[left] <= height[right]){
                if(height[left] >= maxLeftHeight) maxLeftHeight = height[left];
                else water += maxLeftHeight - height[left];
                //we know that there is a wall on the right that is higher or equal the current wall
                //the current wall is also less or equal to the max height wall on the left
                //we add the water difference between the highest wall and all the values in between
                left++;
            }else{
                if(height[right] >= maxRightHeight) maxRightHeight = height[right];
                else water += maxRightHeight - height[right];
                right--;
            }
        }
        return water;
    }
}
