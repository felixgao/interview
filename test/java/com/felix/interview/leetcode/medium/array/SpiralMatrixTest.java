package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/4/17.
 */
public class SpiralMatrixTest {
    @Test
    public void test(){
        int[][] m = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        SpiralMatrix s = new SpiralMatrix();
        System.out.println(s.spiralOrder(m));
    }
}
