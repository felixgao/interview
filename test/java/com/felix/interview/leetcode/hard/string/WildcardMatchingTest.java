package com.felix.interview.leetcode.hard.string;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/19/17.
 */
public class WildcardMatchingTest {
    WildcardMatching w = new WildcardMatching();

    @Test
    public void test1(){
        System.out.println(w.isMatch("aa", "a"));
    }

    @Test
    public void test2(){
        System.out.println(w.isMatch("aa", "aa"));
    }

    @Test
    public void test3(){
        System.out.println(w.isMatch("aaa", "*"));
    }

    @Test
    public void test4(){
        System.out.println(w.isMatch("aa", "a*"));
    }

    @Test
    public void test5(){
        System.out.println(w.isMatch("aa", "?a"));
    }

    @Test
    public void test6(){
        System.out.println(w.isMatch("ab", "?*"));
    }

    @Test
    public void test7(){
        System.out.println(w.isMatch("aab", "c*a*b"));
    }
}
