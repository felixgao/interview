package com.felix.interview.leetcode.hard.array;

import org.junit.Test;

/**
 * Created by felix on 2/5/17.
 */
public class FindMinimumInRotatedArrayIITest {
    FindMinimumInRotatedArrayII f = new FindMinimumInRotatedArrayII();

    @Test
    public void test(){
        int[] a = new int [] {4, 4, 5, 5, 6, 6, 7, 7, 0, 0, 0, 1, 2,2};
        System.out.println(f.findMin(a));
    }

    @Test
    public void test2(){
        int[] a = new int [] {0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(f.findMin(a));
    }
}
