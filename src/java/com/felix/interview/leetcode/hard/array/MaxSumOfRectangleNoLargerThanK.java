package com.felix.interview.leetcode.hard.array;

import java.util.Arrays;

/**
 * Created by felix on 2/20/17.
 * 363
 * https://leetcode.com/problems/max-sum-of-sub-matrix-no-larger-than-k/?tab=Description
 */
public class MaxSumOfRectangleNoLargerThanK {
    public int maxSumSubmatrix(int[][] matrix, int target) {
        if(matrix == null) return 0;
        int row = matrix.length, col = matrix[0].length, res = Integer.MIN_VALUE;
        for(int i = 0; i < col; i++){
            int[] sums = new int[col];
            Arrays.fill(sums, 0);
            for(int j = i; j < col; j++){
                //fill the sum with values of the row
                for(int k = 0; k < row; k++){
                    sums[k] += matrix[k][j];
                }
            }
            //Use Kadane's algorithm to find maximum subarray no more than K
            int curMax = sums[0];
            for(int j = 1; j < sums.length; j++){
                curMax = Math.max(curMax + sums[i], sums[i]);
                if(curMax > target){
                    curMax = target;
                }
            }
            res = Math.max(curMax, res);
        }
        return res;
    }
}
