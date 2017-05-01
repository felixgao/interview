package com.felix.interview.leetcode.medium.string;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/2/17.
 */
public class ValidWordSquareTest {
    ValidWordSquare v = new ValidWordSquare();

    @Test
    public void test1(){
        out.println(v.isValidWordSquare(new String[] {
                "ball",
                "area",
                "read",
                "lady"
        }));
    }

    @Test
    public void test2(){
        out.println(v.isValidWordSquare(new String[] {
                "abcd",
                "bnrt",
                "crmy",
                "dtye"
        }));
    }
}
