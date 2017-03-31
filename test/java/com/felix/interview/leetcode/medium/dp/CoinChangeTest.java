package com.felix.interview.leetcode.medium.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/1/17.
 */
public class CoinChangeTest {
    CoinChange c = new CoinChange();

    @Test
    public void test1(){
        System.out.println(c.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test2(){
        System.out.println(c.coinChange(new int[]{3},5));
    }
}
