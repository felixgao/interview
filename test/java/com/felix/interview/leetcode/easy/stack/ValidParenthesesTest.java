package com.felix.interview.leetcode.easy.stack;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/10/17.
 */
public class ValidParenthesesTest {
    ValidParentheses v = new ValidParentheses();

    @Test
    public void test1(){
        System.out.println(v.isValid("()[]{}"));
    }

    @Test
    public void test2(){
        System.out.println(v.isValid("([)]"));
    }
}
