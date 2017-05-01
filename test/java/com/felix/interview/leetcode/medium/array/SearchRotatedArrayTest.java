package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

/**
 * Created by felix on 2/4/17.
 */
public class SearchRotatedArrayTest {
    SearchRotatedArray s = new SearchRotatedArray();

    @Test
    public void test(){
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
    }

    @Test
    public void test2(){
        System.out.println(s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 9));
    }
}
