package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/5/17.
 */
public class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();

    @Test
    public void test1(){
        System.out.println(l.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
