package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/2/17.
 * 279
 * https://leetcode.com/problems/perfect-squares/?tab=Description
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for(int i = 1; i <= n; i++){
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j * j >= 0 ){
                min = Math.min(min, memo[i - j * j] + 1);
                j++;
            }
            memo[i] = min;
        }
        return memo[n];
    }
}
