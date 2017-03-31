package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * 121
 */
public class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int profit=0, minSoFar=prices[0];
        for(int i =1; i<prices.length; i++){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }
            int currentProfit = prices[i] - minSoFar;
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        return profit;
    }
}
