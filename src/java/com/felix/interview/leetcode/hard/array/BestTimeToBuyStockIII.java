package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/6/17.
 * 123
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class BestTimeToBuyStockIII {
    public int maxProfit(int[] prices) {
        int profit1 = 0, profit2 = 0, maxSoFar = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] > prices[i]){
                maxSoFar += prices[i+1] - prices[i];
            }else{
                if(maxSoFar >= profit2){
                    profit1 = profit2;
                    profit2 = maxSoFar;
                } else if (maxSoFar >= profit1){
                    profit1 = maxSoFar;
                }
                maxSoFar = 0;
            }
        }
        return profit1 + profit2;
    }
}
