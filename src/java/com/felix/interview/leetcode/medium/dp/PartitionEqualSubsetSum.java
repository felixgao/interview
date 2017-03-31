package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/5/17.
 * 416
 * https://leetcode.com/problems/partition-equal-subset-sum/?tab=Description
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0) return false; //only even numbers can be split into two sets
        int target = sum >> 1; // get the subset sum to a particular value;
        return subsetSum(nums, target);
    }

    private boolean subsetSum(int[] nums, int target) {
        boolean[] memo = new boolean[target+1];
        memo[0] = true;
        for(int num : nums){
            for(int j = target; j >= num; j--){
                //check at all the number between target and current number,  that not taking num || not taking num
                memo[j] = memo[j] || memo[j - num];
            }
        }

        return memo[target];
    }
}
