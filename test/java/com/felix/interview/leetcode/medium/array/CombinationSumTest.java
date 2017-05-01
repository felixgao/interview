package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/4/17.
 */
public class CombinationSumTest {
    CombinationSum c = new CombinationSum();

    @Test
    public void test(){
        int[] a = new int[]{2, 3, 6, 7};
        System.out.println(c.combinationSum(a, 7));
    }
}
