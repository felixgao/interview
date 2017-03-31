package com.felix.interview.leetcode.easy.dp;

/**
 * Created by felix on 3/5/17.
 * 303
 * https://leetcode.com/problems/range-sum-query-immutable/?tab=Description
 */
public class RangeSumQuery {
    private int[] memo;
    public RangeSumQuery(int[] nums) {
        //calculate running total
        memo = new int[nums.length];
        memo[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            memo[i] = nums[i] + memo[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i==j || i == 0){
            return memo[j];
        }
        return memo[j] - memo[i];
    }
}
