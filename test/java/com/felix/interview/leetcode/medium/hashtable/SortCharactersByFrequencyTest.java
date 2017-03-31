package com.felix.interview.leetcode.medium.hashtable;

import com.felix.interview.leetcode.medium.hashtable.SortCharactersByFrequency;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/11/17.
 */
public class SortCharactersByFrequencyTest {
    SortCharactersByFrequency s = new SortCharactersByFrequency();

    @Test
    public void test1(){
        System.out.println(s.frequencySort("tree"));
    }

    @Test
    public void test2(){
        System.out.println(s.frequencySort("cccaaa"));
    }

    @Test
    public void test3(){
        System.out.println(s.frequencySort("Aabb"));
    }
}
