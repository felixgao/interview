package com.felix.interview.leetcode.medium.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/5/17.
 */
public class IsSubsequeceTest {
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
