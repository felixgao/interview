package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/1/17.
 */
public class MinimumSubArraySumTest {

    @Test
    public void test(){
        MinimumSubArraySum m = new MinimumSubArraySum();
        System.out.println(m.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }

    @Test
    public void test2(){
        MinimumSubArraySum m = new MinimumSubArraySum();
        System.out.println(m.minSubArrayLen(100, new int[] {2,3,1,2,4,3}));
    }

    @Test
    public void test3(){
        MinimumSubArraySum m = new MinimumSubArraySum();
        System.out.println(m.minSubArrayLen(7, new int[] {2}));
    }
}
