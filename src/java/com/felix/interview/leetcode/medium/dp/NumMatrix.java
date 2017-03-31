package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/2/17.
 * 304
 * https://leetcode.com/problems/range-sum-query-2d-immutable/?tab=Description
 */
public class NumMatrix {

    int[][] memo;

    public NumMatrix(int[][] matrix) {
        if(   matrix           == null
                || matrix.length    == 0
                || matrix[0].length == 0   ){
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        memo = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                memo[i][j] = memo[i - 1][j] + memo[i][j - 1] -memo[i - 1][j - 1] + matrix[i - 1][j - 1] ;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int iMin = Math.min(row1, row2);
        int iMax = Math.max(row1, row2);

        int jMin = Math.min(col1, col2);
        int jMax = Math.max(col1, col2);

        return memo[iMax + 1][jMax + 1] - memo[iMax + 1][jMin] - memo[iMin][jMax + 1] + memo[iMin][jMin];
    }
}
