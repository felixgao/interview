package com.felix.interview.leetcode.hard.array;

import com.felix.interview.leetcode.easy.array.BestTimeToBuyStock;
import org.junit.Test;

/**
 * Created by felix on 2/6/17.
 */
public class BestTimeToBuyStockIIITest {
    BestTimeToBuyStockIII b = new BestTimeToBuyStockIII();

    @Test
    public void testExample1(){
        int[] prices = new int[]{
                7, 1, 5, 3, 6, 4
        };
        System.out.println(b.maxProfit(prices));
    }

    @Test
    public void testExample2(){
        int[] prices = new int[]{
                7, 6, 4, 3, 1
        };
        System.out.println(b.maxProfit(prices));
    }
}
