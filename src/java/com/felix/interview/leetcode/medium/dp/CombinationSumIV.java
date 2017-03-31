package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/1/17.
 * 337
 * https://leetcode.com/problems/combination-sum-iv/?tab=Description
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        memo[0] = 1;
        for(int i = 1; i < memo.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (i - nums[j] >= 0) {
                    memo[i] += memo[i - nums[j]];
                }
            }
        }
        return memo[target];
    }
}
