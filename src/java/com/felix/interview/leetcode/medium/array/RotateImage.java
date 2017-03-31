package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/4/17.
 * https://leetcode.com/problems/rotate-image/
 * 48
 */
public class RotateImage {
    /*
 * clockwise rotate
 * first reverse up to down, then swap the symmetry
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
*/
    public void rotateClockwise(int[][] matrix) {
        reverse(matrix);
        for(int i = 0; i < matrix.length; ++i){
            for(int j = i + 1; j < matrix[i].length; ++j){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }

    /*
 * anticlockwise rotate
 * first reverse left to right, then swap the symmetry
 * 1 2 3     3 2 1     3 6 9
 * 4 5 6  => 6 5 4  => 2 5 8
 * 7 8 9     9 8 7     1 4 7
*/
    public void rotateAntiClockwise(int[][] matrix){

    }

    void reverse(int[][] matrix){
        int rowBegin = 0, rowEnd = matrix.length-1;
        while(rowBegin <= rowEnd){
            int[] t = matrix[rowBegin];
            matrix[rowBegin++] = matrix[rowEnd];
            matrix[rowEnd--] = t;

        }
    }
}
