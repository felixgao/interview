package com.felix.interview.leetcode.medium.binarysearch;

import org.junit.Test;

/**
 * Created by felix on 2/23/17.
 */
public class IsSubsequenceTest {
    IsSubsequence i = new IsSubsequence();

    @Test
    public void test1(){
        System.out.println(i.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2(){
        System.out.println(i.isSubsequence("axc", "ahbgdc"));

    }
}
