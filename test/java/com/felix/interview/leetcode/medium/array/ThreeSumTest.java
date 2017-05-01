package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/5/17.
 */
public class ThreeSumTest {
    ThreeSum t = new ThreeSum();

    @Test
    public void test(){
        int[] a = new int[] {-1, 0, 1, 2, -1, -4};
        System.out.println(t.threeSum(a));
    }

    @Test
    public void test2(){
        int[] a = new int[] {-1, 0, 1, 2, -1, -4};
        System.out.println(t.threeSum2(a));
    }
}
