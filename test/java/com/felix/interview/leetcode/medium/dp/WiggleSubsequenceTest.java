package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/4/17.
 */
public class WiggleSubsequenceTest {
    WiggleSubsequence w = new WiggleSubsequence();

    @Test
    public void test1(){
        System.out.println(w.wiggleMaxLength(new int[] {1,7,4,9,2,5}));
    }

    @Test
    public void test2(){
        System.out.println(w.wiggleMaxLength(new int[] {1,17,5,10,13,15,10,5,16,8}));
    }
}
