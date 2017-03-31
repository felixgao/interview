package com.felix.interview.leetcode.hard.stack;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/11/17.
 */
public class TrappingRainWaterTest {
    TrappingRainWater t = new TrappingRainWater();

    @Test
    public void test1(){
        System.out.println(t.trap(new int [] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
