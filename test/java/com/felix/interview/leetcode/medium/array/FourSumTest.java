package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/5/17.
 */
public class FourSumTest {
    FourSum f = new FourSum();

    @Test
    public void test(){
        int [] a = new int[] {1, 0, -1, 0, -2, 2};
        System.out.println(f.fourSum(a, 0));
    }
}
