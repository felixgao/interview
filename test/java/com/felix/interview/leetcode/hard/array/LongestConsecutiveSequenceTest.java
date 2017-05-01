package com.felix.interview.leetcode.hard.array;

import org.junit.Test;

/**
 * Created by felix on 2/6/17.
 */
public class LongestConsecutiveSequenceTest {
    LongestConsecutiveSequence l = new LongestConsecutiveSequence();

    @Test
    public void test(){
        int[] a = new int[] {100, 4, 200, 1, 3, 2};
        System.out.println(l.longestConsecutive(a));
    }

    @Test
    public void test2(){
        int[] a = new int[] {100, 7, 200, 5, 3, 1, 6, 4, 2};
        System.out.println(l.longestConsecutive(a));
    }

    @Test
    public void test3(){
        int[] a = new int[] {100, 7, 6, 5, 1, 2, 3,200, 300, 400, 4};
        System.out.println(l.longestConsecutive(a));
    }

    @Test
    public void test4(){
        int[] a = new int[] {100, 4,5,6,7, 1, 2, 3,200, 300, 400, 4};
        System.out.println(l.longestConsecutive(a));
    }
}
