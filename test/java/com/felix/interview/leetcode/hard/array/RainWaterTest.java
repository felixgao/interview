package com.felix.interview.leetcode.hard.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/8/17.
 */
public class RainWaterTest {
    RainWater r = new RainWater();

    @Test
    public void test1(){
        System.out.println(r.trap(new int[] {1,0,1} ));
    }

    @Test
    public void test2(){
        System.out.println(r.trap(new int[] {1,2,3,4} ));
    }

    @Test
    public void test3(){
        System.out.println(r.trap(new int[] {4,3,2,1} ));
    }

    @Test
    public void test4(){
        System.out.println(r.trap(new int[] {1,2,3,4,3,2,1} ));
    }

}
