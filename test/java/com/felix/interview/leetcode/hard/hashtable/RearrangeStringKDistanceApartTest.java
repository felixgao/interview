package com.felix.interview.leetcode.hard.hashtable;

import org.junit.Test;

/**
 * Created by felix on 2/11/17.
 */
public class RearrangeStringKDistanceApartTest {
    RearrangeStringKDistanceApart r = new RearrangeStringKDistanceApart();

    @Test
    public void test1(){
        System.out.println(r.rearrangeString("aabbcc",3));
    }

    @Test
    public void test2(){
        System.out.println(r.rearrangeString("aabbcc",2));
    }

    @Test
    public void test3(){
        System.out.println(r.rearrangeString("aaacc",3));
    }
}
