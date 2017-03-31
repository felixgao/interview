package com.felix.interview.leetcode.hard.dp;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by felix on 2/27/17.
 * 363
 * https://leetcode.com/problems/max-sum-of-sub-matrix-no-larger-than-k/?tab=Description
 */
public class MaximalRectangleSumNoLargerThanK {
    //Kadane's algorithm
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0) return 0;
        int row = matrix.length, col = matrix[0].length, result = Integer.MIN_VALUE;
        int[] sums = new int[row];
        //outer loop should use smaller axis
        //now we assume we have more rows than cols, therefore outer loop will be based on cols
        for (int l = 0; l < col; ++l) {
            Arrays.fill(sums, 0);
            //array that accumulate sums for each row from left to right
            for (int r = l; r < col; ++r) {
                for (int i = 0; i < row; ++i) {
                    //update sums[] to include values in curr right col
                    sums[i] += matrix[i][r];
                }
            }
            //we use TreeSet to help us find the rectangle with maxSum <= k with O(logN) time
            TreeSet<Integer> set = new TreeSet<Integer>();
            //add 0 to cover the single row case
            set.add(0);
            int currSum = 0;

            for(int sum : sums){
                currSum += sum;
                //we use sum subtraction (curSum - sum) to get the subarray with sum <= k
                //therefore we need to look for the smallest sum >= currSum - k
                Integer num = set.ceiling(currSum - k);
                if(num != null) result = Math.max( result, currSum - num );
                set.add(currSum);
            }
        }
        return result;
    }
}
