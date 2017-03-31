package com.felix.interview.leetcode.medium.dp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 3/1/17.
 */
public class CountingBitsTest {
    CountingBits c = new CountingBits();

    @Test
    public void test(){
        System.out.println(Arrays.toString(c.countBits(5)));
    }
}
