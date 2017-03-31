package com.felix.interview.leetcode.medium.binarysearch;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/25/17.
 */
public class Search2DMatrixTest {
    Search2DMatrix s = new Search2DMatrix();

    @Test
    public void test(){
        System.out.println(s.searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        }, 3));
    }

    @Test
    public void test2(){
        System.out.println(s.searchMatrix(new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        }, 4));
    }
}
