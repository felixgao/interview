package com.felix.interview.leetcode.medium.binarysearch;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/23/17.
 */
public class LongestIncreaseSubsequenceTest {
    LongestIncreaseSubsequence l = new LongestIncreaseSubsequence();

    @Test
    public void test(){
        System.out.println(l.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
