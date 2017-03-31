package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/3/17.
 * 73
 * https://leetcode.com/problems/set-matrix-zeroes/
 *
 *
 * [                               [
 *  [1, 2, 3, 4]                     [1, 0, 3, 0]
 *  [2, 3, 4, 5]        ----->       [2, 0, 4, 5]
 *  [3, 0, 5, 6]        ----->       [0, 0 ,0, 0]
 *  [4, 5, 6, 0]                     [0, 0, 0 ,0]
 * ]                               ]
 *
 * To accomplish this we will use the the first element of each row and column to indicate if the row/col
 * needs to be zerod out.
 * since row0/col0 occupies the same entry, we will need to create a separate variable to keep track it
 */
public class MatrixZeros {
    public void setZeroes(int[][] matrix) {

        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            //if any row have a zero for column 0, we will need to set col0 to 0
            if (matrix[i][0] == 0) col0 = 0;
            //for the rest of the columns check if any entries is 0, then set the perspective row0/col0
            //entries to 0 as indicator
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        //building the matrix from the bottom up
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}
