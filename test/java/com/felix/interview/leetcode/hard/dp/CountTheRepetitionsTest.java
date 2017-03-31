package com.felix.interview.leetcode.hard.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/25/17.
 *
 */
public class CountTheRepetitionsTest {
    CountTheRepetitions c = new CountTheRepetitions();

    @Test
    public void test(){
        System.out.println(c.getMaxRepetitions("acb", 4, "ab", 2));
    }

    @Test
    public void test2(){
        System.out.println(c.getMaxRepetitions("acbdef", 4, "abe", 4));
    }
}
