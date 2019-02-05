package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/23/17.
 * 378
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/?tab=Description
 */
public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        // get the value of the matrix at the first and last element
        int lo = matrix[0][0], hi = matrix[n-1][n-1];
        while(lo < hi){
            int count = 0;
            int mid = lo + (hi - lo) / 2; // what is the mid value of the matrix
            int j = n -1;
            for(int i=0; i < n; i++){
                while(j>=0 && matrix[i][j] > mid) j--; //decrementing j to -1 if the first element is still larger than mid
                //potential short circuit after j == -1
                count += (j + 1);
                // if j == -1 break
            }
            if (count < k){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return lo;
    }

    public int kthSmallest2(int[][] matrix, int k) {
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
