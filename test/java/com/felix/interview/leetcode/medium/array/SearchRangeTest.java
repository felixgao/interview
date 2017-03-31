package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/4/17.
 */
public class SearchRangeTest {
    SearchRange s = new SearchRange();

    @Test
    public void test(){
        System.out.println(Arrays.toString(s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    @Test
    public void test2(){
        System.out.println(Arrays.toString(s.searchRange(new int[]{5, 7, 8, 8, 8, 10}, 8)));
    }

    @Test
    public void test3(){
        System.out.println(Arrays.toString(s.searchRange(new int[]{5, 7, 8, 8, 8, 8, 10}, 8)));
    }
}
