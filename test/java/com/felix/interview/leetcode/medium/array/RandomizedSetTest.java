package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/29/17.
 */
public class RandomizedSetTest {

    @Test
    public void test(){
        RandomizedSet r = new RandomizedSet();
        System.out.println(r.insert(1));
        System.out.println(r.remove(2));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());
        System.out.println(r.remove(1));
        System.out.println(r.insert(2));
        System.out.println(r.getRandom());

    }
}
