package com.felix.interview.leetcode.easy.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/5/17.
 */
public class ClimbingStairsTest {
    ClimbingStairs c = new ClimbingStairs();

    @Test
    public void test1(){
        System.out.println(c.climbStairs(5));
        System.out.println(c.climbStairsDP(5));
    }
}
