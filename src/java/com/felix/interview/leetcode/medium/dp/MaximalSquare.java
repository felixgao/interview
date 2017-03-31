package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/4/17.
 * 221
 * https://leetcode.com/problems/maximal-square/?tab=Description
 */
public class MaximalSquare {
    public int maximalSquare(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] memo = new int[row+1][col+1];
        //fill first row, and first col
        int max = 0;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i-1][j-1] == 1){
                    memo[i][j] = Math.min(memo[i-1][j], Math.min(memo[i][j-1], memo[i-1][j-1])) + 1;
                    max = Math.max(memo[i][j] * memo[i][j], max);
                }
            }
        }
        return max;
    }
}
