package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/5/17.
 */
public class ThreeSumClosestTest {
    ThreeSumClosest t = new ThreeSumClosest();

    @Test
    public void test(){
        int[] a = new int[] {-1, 2, 1, -4};
        System.out.println(t.threeSumClosest(a, 1));
    }
}
