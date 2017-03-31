package com.felix.interview.leetcode.medium.binarysearch;

import java.util.Arrays;

/**
 * Created by felix on 2/23/17.
 * 300
 * https://leetcode.com/problems/longest-increasing-subsequence/?tab=Description
 */
public class LongestIncreaseSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length];
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            //idx = -(insert_index-1) if the value does not exists in the array
            int idx = Arrays.binarySearch(memo, 0, len, nums[i]);
            if(idx < 0) idx = -(idx + 1);
            memo[idx] = nums[i];
            if(i == len) len++;
        }
        return len;
    }
}
