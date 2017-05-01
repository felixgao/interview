package com.felix.interview.techindelight.dynamicprogramming;

/**
 * for each item we can either take it or not take it
 * if take, maxWeight - weights[i]
 */
public class Knapsack {
    public int knapsack(int[] prices, int[] weights, int maxWeight){
        int[][] memo = new int[weights.length+1][maxWeight+1];
        for(int i = 1; i < memo.length; i++){ //number of items
            for(int j = 1; j < memo[0].length; j++){ //weights from 0 .. maxWeight
                if(weights[i-1] <= j){
                    memo[i][j] = Math.max(
                            prices[i-1] + memo[i-1][j - weights[i-1]],
                            memo[i-1][j]
                    );
                }else{
                    memo[i][j] = memo[i-1][j];
                }
            }
        }
        return memo[weights.length][maxWeight];
    }
}
