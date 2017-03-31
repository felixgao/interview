package com.felix.interview.leetcode.medium.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/4/17.
 */
public class MaximalSquareTest {
    MaximalSquare m = new MaximalSquare();

    @Test
    public void test1(){
        System.out.println(m.maximalSquare(new int[][]{
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
        }));
    }

    @Test
    public void test2(){
        System.out.println(m.maximalSquare(new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0},
        }));
    }
}
