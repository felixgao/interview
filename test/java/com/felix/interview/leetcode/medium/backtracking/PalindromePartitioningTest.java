package com.felix.interview.leetcode.medium.backtracking;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/8/17.
 */
public class PalindromePartitioningTest {
    PalindromePartitioning p = new PalindromePartitioning();

    @Test
    public void test1(){
        System.out.println(p.partition("aab"));
    }

    @Test
    public void test2(){
        System.out.println(p.partition("aabbaa"));
    }
}
