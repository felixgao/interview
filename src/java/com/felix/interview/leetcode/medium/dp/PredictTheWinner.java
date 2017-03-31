package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/3/17.
 * 486
 * https://leetcode.com/problems/predict-the-winner/?tab=Description
 */
public class PredictTheWinner {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n][n];
        int res = recursive(nums, memo, 0, n - 1);
        return res >= 0;
    }

    private int recursive(int[] nums, Integer[][] memo, int left, int right) {
        if (memo[left][right] != null) return memo[left][right];
        if (left == right) {
            return nums[left];
        }
        int l = nums[left] - recursive(nums, memo, left + 1, right);
        int r = nums[right] - recursive(nums, memo, left, right - 1);
        memo[left][right] = Math.max(l, r);
        return memo[left][right];
    }


}
