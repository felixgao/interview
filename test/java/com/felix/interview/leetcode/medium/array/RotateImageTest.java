package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 2/4/17.
 */
public class RotateImageTest {
    RotateImage r = new RotateImage();
    @Test
    public void testClockwise(){
        int[][] m = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        r.rotateClockwise(m);
        for(int[] r : m){
            System.out.println(Arrays.toString(r));
        }
    }

}
