package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/1/17.
 * 322
 * https://leetcode.com/problems/coin-change/?tab=Description
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        Arrays.sort(coins);
        for(int i = 1; i <= amount; i++){
            coinChange(coins, memo, i);
        }
        return memo[amount] == 0 ? -1 : memo[amount];
    }

    private int coinChange(int[] coins, int[]memo, int amount){
        int res = Integer.MAX_VALUE;
        if(amount < 0) return -1;
        if(memo[amount] != 0) return memo[amount];
        for(int coin : coins){
            if(coin == amount) {
                res = 1;
            } else if(coin < amount){
                int r = coinChange(coins, memo, amount - coin);
                if (r > 0){
                    res = Math.min(res, 1 + r);
                }
            }
        }
        memo[amount] = res == Integer.MAX_VALUE ? 0 : res;
        return res;
    }
}
