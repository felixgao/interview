package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/2/17.
 *494
 *https://leetcode.com/problems/target-sum/
 *
 sum(P) - sum(N) = target
 sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
 2 * sum(P) = target + sum(nums)
 sum(P) = (target + sum(nums))/2
 *
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        return sum < 0 || (target+sum) % 2 != 0 ? 0 : subsetSum(nums, (target + sum) >>> 1);
    }

    public int subsetSum(int[] nums, int s) {
        int[] memo = new int[s+1];
        memo[0] = 1;
        for(int n : nums){
            for(int i = s; i >=n; i--){
                memo[i] += memo[i - n];
            }
        }
        return memo[s];
    }
}
