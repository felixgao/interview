package com.felix.interview.leetcode.hard.backtracking;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/23/17.
 */
public class RemoveInvalidParenthesisTest {
    RemoveInvalidParenthesis r = new RemoveInvalidParenthesis();

    @Test
    public void test(){
        out.println(r.removeInvalidParentheses("()())()"));
    }
}
