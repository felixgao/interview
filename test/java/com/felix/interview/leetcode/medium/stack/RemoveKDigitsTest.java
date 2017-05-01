package com.felix.interview.leetcode.medium.stack;

import org.junit.Test;

/**
 * Created by felix on 3/11/17.
 */
public class RemoveKDigitsTest {
    RemoveKDigits r = new RemoveKDigits();

    @Test
    public void test1(){
        System.out.println(r.removeKdigits("10200", 1));
        System.out.println(r.removeKdigits("10200", 2));
    }
}
