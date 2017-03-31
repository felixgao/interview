package com.felix.interview.leetcode.hard.binarysearch;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/20/17.
 */
public class MaxSumOfRectangleNoLargerThanKTest {
    MaxSumOfRectangleNoLargerThanK m = new MaxSumOfRectangleNoLargerThanK();

    @Test
    public void test1(){
        System.out.println(m.maxSumSubmatrix(new int[][]{
                {1,  0, 1},
                {0, -2, 3}
        }, 2));
    }
}
