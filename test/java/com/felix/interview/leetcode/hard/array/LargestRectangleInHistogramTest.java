package com.felix.interview.leetcode.hard.array;

import org.junit.Test;

/**
 * Created by felix on 2/8/17.
 */
public class LargestRectangleInHistogramTest {
    LargestRectangleInHistogram l = new LargestRectangleInHistogram();

    @Test
    public void test1(){
        System.out.println(l.largestRectangleArea(new int[] {2,1,5,6,2,3}));
    }

    @Test
    public void test2(){
        System.out.println(l.largestRectangleArea(new int[] {1,2,4}));
    }

    @Test
    public void test3(){
        System.out.println(l.largestRectangleArea(new int[] {1,3,2,1,2}));
    }

    @Test
    public void test4(){
        System.out.println(l.largestRectangleArea(new int[] {1,5,4,6,2}));
    }

}
