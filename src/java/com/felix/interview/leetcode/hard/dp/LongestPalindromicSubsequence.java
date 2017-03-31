package com.felix.interview.leetcode.hard.dp;

import java.util.Arrays;

/**
 * Created by felix on 2/26/17.
 * 516
 * https://leetcode.com/problems/longest-palindromic-subsequence/
 */
public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s){
        int n = s.length();
        int[] memo = new int[n];
        Arrays.fill(memo, 1);
        for(int j = 1; j < n; j++){
            int pre = memo[j];
            for(int i = j; i >=0; i--){
                int tmp = memo[i];
                if(s.charAt(i) == s.charAt(j)){
                    memo[i] = ((i + 1 <= j -1) ? pre + 2 : 2);
                } else {
                    memo[i] = Math.max(memo[i + 1], memo[i]);
                }
                pre = tmp;
            }
        }
        return memo[0];
    }

    public int longestPalindromeSubseq2(String s){
        int n = s.length();
        int[][] memo = new int[n][n];

        for(int i = n -1; i >= 0; i--){
            memo[i][i] = 1; //when only single character is the longest sub sequence
            //check the sub sequence from i+1 to the end of the string
            for(int j = i+1; j < n; j++){
                if(s.charAt(i) == s.charAt(j)){
                    memo[i][j] = memo[i+1][j-1] + 2;
                } else {
                    memo[i][j] = Math.max(memo[i+1][j], memo[i][j-1]);
                }
            }
        }
        return memo[0][n-1];
    }
}
