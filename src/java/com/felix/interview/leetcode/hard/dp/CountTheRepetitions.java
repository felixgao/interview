package com.felix.interview.leetcode.hard.dp;

/**
 * Created by felix on 2/25/17.
 * 466
 * https://leetcode.com/problems/count-the-repetitions/?tab=Description
 */
public class CountTheRepetitions {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int[][] memo = new int[s1.length()+1][s2.length()+1];
        for(int i = 1; i <= s1.length(); i++){
            for(int j = 1; j <= s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    memo[i][j] = memo[i-1][j-1];
                }else{
                    memo[i][j] = 1 + Math.min(memo[i-1][j], memo[i][j-1]);
                }
            }
        }
        int mul = Math.abs(n1-n2);
        return memo[s1.length()][s2.length()] * (mul == 0 ? 1 : mul);
    }
}
