package com.felix.interview.leetcode.hard.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/26/17.
 */
public class FrogJumpTest {
    FrogJump f = new FrogJump();

    @Test
    public void test1(){
        System.out.println(f.canCross(new int[] {0,1,3,5,6,8,12,17}));
    }

    @Test
    public void test2(){
        System.out.println(f.canCross(new int[] {0,1,2,3,4,8,9,11}));
    }
}
