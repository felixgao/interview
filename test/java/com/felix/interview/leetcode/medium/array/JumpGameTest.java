package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/4/17.
 */
public class JumpGameTest {
    JumpGame j = new JumpGame();

    @Test
    public void test1(){
        System.out.println(j.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    public void test2(){
        System.out.println(j.canJump(new int[]{2,3,1,0,4}));
    }

    @Test
    public void test3(){
        System.out.println(j.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    public void test4(){
        System.out.println(j.canJumpOptimized(new int[]{3,2,1,0,4}));
    }

    @Test
    public void test5(){
        System.out.println(j.canJumpOptimized(new int[]{2,2,3,0,0,0,4}));
    }
}
