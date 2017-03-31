package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.MoveZeros;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/27/17.
 */
public class MoveZerosTest {


    @Test
    public void test(){
        MoveZeros moveZeros = new MoveZeros();
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZeros.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
