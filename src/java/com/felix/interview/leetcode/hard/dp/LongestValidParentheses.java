package com.felix.interview.leetcode.hard.dp;

/**
 * Created by felix on 2/25/17.
 * 32
 * https://leetcode.com/problems/longest-valid-parentheses/?tab=Description
 *
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s.length() <= 1 ) return 0;
        int curMax = 0;
        int[] memo = new int[s.length()];
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ')' &&
                    i - memo[i-1]-1 >= 0 && s.charAt(i - memo[i-1]-1) == '(' ){
                int prev = i-memo[i-1] -2 >= 0 ? memo[i-memo[i-1] -2] : 0;
                memo[i] = memo[i-1] + 2 + prev;
                curMax = Math.max(memo[i], curMax);
            }
        }
        return curMax;
    }
}
