package com.felix.interview.leetcode.easy.dp;

/**
 * Created by felix on 3/5/17.
 * 70
 * https://leetcode.com/problems/climbing-stairs/?tab=Description
 */
public class ClimbingStairs {
    public int climbStairsDP(int n) {
        int[] memo = new int[n+1];
        memo[0] = memo[1] = 1;
        for(int i = 2; i <= n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public int climbStairs(int n){
        if(n <= 1) return 1;
        if(n == 2) return 2;
        int oneStep = 1;
        int twoStep = 2;
        int ans = 0;
        for(int i = 2; i < n; i++){
            ans = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = ans;
        }
        return ans;
    }
}
