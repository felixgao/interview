package com.felix.interview.leetcode.hard.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/28/17.
 */
public class BurstBallonsTest {
    BurstBalloons b = new BurstBalloons();

    @Test
    public void test1(){
        System.out.println(b.maxCoins(new int[]{3, 1, 5, 8}));
    }
}
