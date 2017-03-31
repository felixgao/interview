package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.RotateArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/27/17.
 */
public class RotateArrayTest {
    @Test
    public void testRotate(){
        RotateArray rotateArray = new RotateArray();
        int[] arr = new int[] {1,2,3,4,5,6,7};
        rotateArray.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
