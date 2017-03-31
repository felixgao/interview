package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/2/17.
 * 309
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/?tab=Description
 */
public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
        }
        return sell;
    }
}
