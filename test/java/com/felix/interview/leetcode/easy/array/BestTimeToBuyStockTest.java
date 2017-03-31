package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.BestTimeToBuyStock;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/29/17.
 */
public class BestTimeToBuyStockTest {

    @Test
    public void testExample1(){
        BestTimeToBuyStock buy = new BestTimeToBuyStock();
        int[] prices = new int[]{
                7, 1, 5, 3, 6, 4
        };
        System.out.println(buy.maxProfit(prices));
    }

    @Test
    public void testExample2(){
        BestTimeToBuyStock buy = new BestTimeToBuyStock();
        int[] prices = new int[]{
                7, 6, 4, 3, 1
        };
        System.out.println(buy.maxProfit(prices));
    }
}
