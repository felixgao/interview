package com.felix.interview.leetcode.hard.array;

import com.felix.interview.leetcode.hard.array.MaximalRectangle;
import org.junit.Test;

/**
 * Created by felix on 1/23/17.
 */
public class MaximalRectangleTest {
    MaximalRectangle maximalRectangle = new MaximalRectangle();

    @Test
    public void sampleInput(){
        char[][] matrix = new char[][]{
                {'0','0','0','1','0','0','0'},
                {'0','0','1','1','1','0','0'},
                {'0','0','1','1','1','0','0'},
                {'0','0','0','1','0','0','0'}
        };

        int result = maximalRectangle.maximalRectangle(matrix);
        System.out.println(result);
    }
}
