package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/4/17.
 * 59
 * https://leetcode.com/problems/spiral-matrix-ii/
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowBegin = 0, rowEnd = n-1, colBegin = 0, colEnd = n-1;
        int value = 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            //rowBegin, colBegin -> colEnd
            for(int j = colBegin; j <= colEnd; j++){
                matrix[rowBegin][j] = value++;
            }
            rowBegin++;
            //colEnd, rowBegin - > rowEnd
            for(int i = rowBegin; i <= rowEnd; i++){
                matrix[i][colEnd] = value++;
            }
            colEnd--;
            //rowEnd, colEnd - > colBegin
            for(int j = colEnd; j >= colBegin; j--){
                matrix[rowEnd][j] = value++;
            }
            rowEnd--;
            //colBegin, rowEnd -> rowBegin
            for(int i = rowEnd; i >= rowBegin; i--){
                matrix[i][colBegin] = value++;
            }
            colBegin++;
        }
        return matrix;
    }
}
