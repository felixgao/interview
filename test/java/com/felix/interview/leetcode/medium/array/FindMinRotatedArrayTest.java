package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/2/17.
 */
public class FindMinRotatedArrayTest {

    @Test
    public void test(){
        FindMinRotatedArray f = new FindMinRotatedArray();
        System.out.println(f.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}));
    }
}
