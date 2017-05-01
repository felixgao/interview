package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/2/17.
 */
public class SortColorsTest {

    @Test
    public void test(){
        int[] a = new int[] {1,0,1,0,2,0,1,0,1,2,1};
        SortColors s = new SortColors();
        s.sortColors(a);
        System.out.println(Arrays.toString(a));
    }
}
