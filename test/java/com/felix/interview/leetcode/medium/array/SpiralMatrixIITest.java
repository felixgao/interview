package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/4/17.
 */
public class SpiralMatrixIITest {

    @Test
    public void test(){
        SpiralMatrixII s = new SpiralMatrixII();
        int[][] r = s.generateMatrix(3);
        for(int[] row : r){
            System.out.println(Arrays.toString(row));
        }
    }
}
