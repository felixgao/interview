package com.felix.interview.leetcode.hard.hashtable;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/11/17.
 */
public class PalindromePairsTest {
    PalindromePairs p = new PalindromePairs();

    @Test
    public void test1(){
        System.out.println(p.palindromePairs(new String[]{"bat", "tab", "cat"}));
    }

    @Test
    public void test2(){
        System.out.println(p.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"}));
    }
}
