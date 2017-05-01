package com.felix.interview.leetcode.medium.string;

import org.junit.Test;

/**
 * Created by felix on 2/19/17.
 */
public class SimplyPathTest {
    SimplyPath s = new SimplyPath();

    @Test
    public void test1(){
        System.out.println(s.simplifyPath("/home/"));
    }

    @Test
    public void test2(){
        System.out.println(s.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void test3(){
        System.out.println(s.simplifyPath("/../"));
    }

    @Test
    public void test4(){
        System.out.println(s.simplifyPath("/home//foo/"));
    }
}
