package com.felix.interview.leetcode.medium.array;

import java.util.Arrays;

/**
 * Created by felix on 2/5/17.
 * 16
 * https://leetcode.com/problems/3sum-closest/
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int lo = i + 1, hi  = nums.length - 1;
            while(lo < hi){
                int temp = Math.abs(target - (nums[i] + nums[lo] + nums[hi]));
                if (temp == 0){
                    return target;
                }
                if(temp < ans){
                    sum = nums[i] + nums[lo] + nums[hi];
                    ans = temp;
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return sum;
    }
}
