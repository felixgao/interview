package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.MergeSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/29/17.
 */
public class MergeSortedArrayTest {

    @Test
    public void test(){
        int[] nums1 = new int[]{
                1,3,5,7,9,0,0,0,0,0
        };
        int[] nums2 = new int[]{
                2,4,6,8,10
        };
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1, 5, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
}
