package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/25/17.
 * 74
 * https://leetcode.com/problems/search-a-2d-matrix/?tab=Description
 *
 * The input is really one contiguous array that is chopped into m equal pieces
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int lo = 0, hi = (row  *  col) -1;

        while(lo < hi){
            int mid = (lo + hi) / 2;
            int m_row = mid / col, m_col = mid % col;
            if(matrix[m_row][m_col] == target) return true;
            if(matrix[m_row][m_col] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return matrix[lo/col][lo%col] == target;
    }
}
