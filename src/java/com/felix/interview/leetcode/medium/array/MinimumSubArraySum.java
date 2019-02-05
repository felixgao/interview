package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 1/31/17.
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 */
public class MinimumSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int sum = 0, min=Integer.MAX_VALUE;
        int i = 0, j=0;

        while(j < nums.length){
            sum += nums[j++];

            while(sum >= s) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
