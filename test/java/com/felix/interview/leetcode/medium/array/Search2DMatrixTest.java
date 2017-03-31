package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/3/17.
 */
public class Search2DMatrixTest {

    @Test
    public void test(){
        int[][] m = new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        Search2DMatrix s = new Search2DMatrix();
        System.out.println(s.searchMatrix(m, 5));
        System.out.println(s.searchMatrix(m, 16));
        System.out.println(s.searchMatrix(m, 17));
    }

    @Test
    public void testBinarySearch(){
        int[][] m = new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        Search2DMatrix s = new Search2DMatrix();
        System.out.println(s.binarySearchMatrix(m, 5));
        System.out.println(s.binarySearchMatrix(m, 16));
        System.out.println(s.binarySearchMatrix(m, 17));
    }
}
