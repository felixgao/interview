package com.felix.interview.leetcode.hard.dp;

import com.felix.interview.leetcode.easy.array.BestTimeToBuyStock;
import org.junit.Test;

/**
 * Created by felix on 2/27/17.
 */
public class BestTimeToBuyAndSellStockIVTest {
    BestTimeToBuyAndSellStockIV b = new BestTimeToBuyAndSellStockIV();

    @Test
    public void test1(){
        System.out.println(b.maxProfit(2, new int[]{1,2,3,4,5}));
    }

    @Test
    public void test2(){
        System.out.println(b.maxProfit(2, new int[]{1,3,2,5,4}));
    }

    @Test
    public void test3(){
        System.out.println(b.maxProfit(1, new int[]{1,3,2,5,4}));
    }
}
