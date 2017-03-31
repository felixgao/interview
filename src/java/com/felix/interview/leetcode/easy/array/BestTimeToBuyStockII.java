package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * 122
 */
public class BestTimeToBuyStockII {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i<prices.length-1; i++){
            if(prices[i+1]< prices[i]){
                total += prices[i+1] - prices[i];
            }
        }
        return total;
    }
}
