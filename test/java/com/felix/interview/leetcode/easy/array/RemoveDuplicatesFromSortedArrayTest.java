package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/29/17.
 */
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test(){
        int [] array = new int[]{
                1,1,2,2,2,2,2,2,2,2,3,3
        };
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}
