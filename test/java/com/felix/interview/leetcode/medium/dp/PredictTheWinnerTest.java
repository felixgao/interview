package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/3/17.
 */
public class PredictTheWinnerTest {
    PredictTheWinner p = new PredictTheWinner();

    @Test
    public void test1(){
        System.out.println(p.PredictTheWinner(new int[] {1, 5, 2}));
    }

    @Test
    public void test2(){
        System.out.println(p.PredictTheWinner(new int[] {1, 5, 233, 7}));
    }
}
