package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/2/17.
 */
public class MaximumProductSubarrayTest {

    @Test
    public void test(){
        MaximumProductSubarray m = new MaximumProductSubarray();
        System.out.println(m.maxProduct(new int[]{2,3,-2,4}));
    }


    @Test
    public void testDoubleNegatives(){
        MaximumProductSubarray m = new MaximumProductSubarray();
        System.out.println(m.maxProduct(new int[]{2,3,-2,-2,-1,4}));
    }
}
