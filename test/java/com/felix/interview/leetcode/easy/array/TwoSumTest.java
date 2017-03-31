package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/29/17.
 */
public class TwoSumTest {

    @Test
    public void test(){
        TwoSum t = new TwoSum();
        int[] arr = new int[]{
                2, 7, 11, 15
        };
        System.out.println(Arrays.toString(t.twoSum(arr, 9)));
    }
}
