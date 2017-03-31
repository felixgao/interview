package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/5/17.
 * 300
 * https://leetcode.com/problems/longest-increasing-subsequence/?tab=Description
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n+1];
        int len = 0;
        for(int num : nums){
            int pos = Arrays.binarySearch(memo, 0, len, num);
            if(pos < 0) pos = -(pos + 1);
            memo[pos] = num;
            if(pos == len) len++;
        }
        return len;
    }
}
