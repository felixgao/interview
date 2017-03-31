package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/23/17.
 * 378
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/?tab=Description
 */
public class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int count = getLessEqual(matrix, mid);
            if (count < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

    private int getLessEqual(int[][] matrix, int mid) {
        int res = 0;
        int n = matrix.length, i = n - 1, j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > mid) i--;
            else {
                res += i + 1;
                j++;
            }
        }
        return res;
    }
}
