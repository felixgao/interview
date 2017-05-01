package com.felix.interview.leetcode.medium.string;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 3/25/17.
 */
public class OneEditDistanceTest {
    OneEditDistance o = new OneEditDistance();

    @Test
    public void test1(){
        out.println(o.isOneEditDistance("ab", "abcd"));
        out.println(o.isOneEditDistance("abcd", "ab"));
    }

    @Test
    public void test2(){
        out.println(o.isOneEditDistance("abc", "abcd"));
        out.println(o.isOneEditDistance("abcd", "abc"));
    }

    @Test
    public void test3(){
        out.println(o.isOneEditDistance("abd", "abcd"));
        out.println(o.isOneEditDistance("abcd", "abd"));
    }
}
