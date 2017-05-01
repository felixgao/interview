package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/3/17.
 */
public class LargestDivisibleSubsetTest {
    LargestDivisibleSubset l = new LargestDivisibleSubset();

    @Test
    public void test1(){
        System.out.println(l.largestDivisibleSubset(new int[] {1,2,3}));
    }

    @Test
    public void test2(){
        System.out.println(l.largestDivisibleSubset(new int[] {1,2,4,8}));
    }
}
