package com.felix.interview.leetcode.medium.binarysearch;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/23/17.
 */
public class KthSmallestElementInSortedMatrixTest {
    KthSmallestElementInSortedMatrix k = new KthSmallestElementInSortedMatrix();

    @Test
    public void test1(){
        System.out.println(k.kthSmallest(new int[][]{
                {1,  5,  9},
                {10, 11, 13},
                {12, 13, 15},
        }, 8));
    }

}
