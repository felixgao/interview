package com.felix.interview.leetcode.medium.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/4/17.
 */
public class MaximumProductSubarrayTest {
    MaximumProductSubarray m = new MaximumProductSubarray();

    @Test
    public void test1(){
        System.out.println(m.maxProduct(new int[] {2,3,-2,4}));
    }

    @Test
    public void test2(){
        System.out.println(m.maxProduct(new int[] {2,-3,-2,4}));
    }
}
