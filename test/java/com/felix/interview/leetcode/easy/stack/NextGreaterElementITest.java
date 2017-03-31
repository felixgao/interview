package com.felix.interview.leetcode.easy.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 3/10/17.
 */
public class NextGreaterElementITest {
    NextGreaterElementI n = new NextGreaterElementI();

    @Test
    public void test1(){
        System.out.println(Arrays.toString(n.nextGreaterElement(
                new int[] {4,1,2},
                new int[] {1,3,4,2})));
    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(n.nextGreaterElement(
                new int[] {2,3,4},
                new int[] {1,2,3,4})));
    }
}
