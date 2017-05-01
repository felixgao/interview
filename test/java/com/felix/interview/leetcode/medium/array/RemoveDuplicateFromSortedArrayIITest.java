package com.felix.interview.leetcode.medium.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/2/17.
 */
public class RemoveDuplicateFromSortedArrayIITest {
    @Test
    public void test(){
        RemoveDuplicateFromSortedArrayII r = new RemoveDuplicateFromSortedArrayII();
        int[] array = new int[] {1,1,1,1,2,2,2,3,3,4};
        System.out.println(r.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}
