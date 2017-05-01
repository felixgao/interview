package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/2/17.
 */
public class BestTimeToBuyAndSellStockWithCooldownTest {
    BestTimeToBuyAndSellStockWithCooldown b = new BestTimeToBuyAndSellStockWithCooldown();

    @Test
    public void test(){
        System.out.println(b.maxProfit(new int[] {1, 2, 3, 0, 2}));
    }
}
