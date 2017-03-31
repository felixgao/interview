package com.felix.interview.leetcode.hard.string;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/18/17.
 */
public class InterleavingStringTest {
    InterleavingString i = new InterleavingString();

    @Test
    public void test1(){
        System.out.println(i.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }
    @Test
    public void test2(){
        System.out.println(i.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
