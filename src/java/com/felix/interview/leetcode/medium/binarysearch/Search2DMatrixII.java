package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/24/17.
 * 240
 * https://leetcode.com/problems/search-a-2d-matrix-ii/?tab=Description
 */
public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int i = row, j = 0;
        while(i < row && i >=0 && j < col && j >=0){
            if(matrix[i][j] == target){
                return true;
            } else if (matrix[i][j] < target){
                j++;
            } else{
                i--;
            }
        }
        return false;
    }
}
