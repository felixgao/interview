package com.felix.interview.leetcode.hard.dp;

/**
 * Created by felix on 2/26/17.
 * 132
 * https://leetcode.com/problems/palindrome-partitioning-ii/?tab=Description
 */
public class PalindromePartitionII {
    public int minCut(String s) {
        int n = s.length();
        int[] memo = new int[n+1];
        //assume each character is unique, so we will need n cuts
        for(int i = 0; i <= n; i++) memo[i] = i-1;
        for(int i = 0; i < n; i++){
            //odd length
            for(int j = 0;
                    i + j < n && i - j >= 0 && s.charAt(i-j)==s.charAt(i+j);
                    j++
                    ){
                memo[i+j+1] = Math.min(memo[i+j+1],1+memo[i-j]);
            }

            //even length
            for(int j = 1;
                    i + j < n && i - j + 1 >= 0 && s.charAt(i-j+1) == s.charAt(i+j);
                    j++
                    ){
                memo[i+j+1] = Math.min(memo[i+j+1], 1+memo[i-j+1]);
            }
        }
        return memo[n];
    }

    private boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
