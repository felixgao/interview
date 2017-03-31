package com.felix.interview.leetcode.easy.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/4/17.
 */
public class HouseRobberTest {
    HouseRobber h = new HouseRobber();

    @Test
    public void test1(){
        System.out.println(h.rob(new int[]{100,200,100,300,200,100}));
    }

    @Test
    public void test2(){
        System.out.println(h.rob(new int[]{2,1,1,2}));
    }
}
