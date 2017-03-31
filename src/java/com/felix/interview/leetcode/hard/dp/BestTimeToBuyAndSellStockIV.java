package com.felix.interview.leetcode.hard.dp;

import java.util.PriorityQueue;

/**
 * Created by felix on 2/27/17.
 * 188
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/?tab=Description
 */
public class BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        if (k ==0 || prices.length == 0 ) return 0;
        int profitSoFar = 0;
        for(int i = 1; i < prices.length; i++){
            //increase in price
            if (prices[i] >= prices[i-1]) {
                profitSoFar += prices[i] - prices[i-1];
            } else {
                q.offer(profitSoFar);
                profitSoFar = 0;
                if(q.size() > k){
                    q.poll();
                }
            }
        }
        if(profitSoFar != 0){
            q.offer(profitSoFar);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.stream().mapToInt(i -> i.intValue()).sum();
    }
}
