package com.felix.interview.leetcode.medium.backtracking;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/9/17.
 */
public class SubsetTest {
    Subset s = new Subset();

    @Test
    public void test(){
        System.out.println(s.subsets(new int[] {1,2,3}));
    }
}
