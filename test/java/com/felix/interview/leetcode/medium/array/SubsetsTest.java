package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/2/17.
 */
public class SubsetsTest {
    @Test
    public void test(){
        int[] a = new int[]{1,2,3};
        Subsets s = new Subsets();
        System.out.println(s.subsets(a));
    }
}
