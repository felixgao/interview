package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/3/17.
 * 74
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * It is efficient if you start from the bottom left position
 * if value > target, move up
 * if value < target move right
 * if we reach the end of the array or top of the array return false
 *
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1, col = 0;
        while(     row >= 0
                && row < matrix.length
                && col >=0
                && col < matrix[row].length
                ){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }

    public boolean binarySearchMatrix(int[][] matrix, int target){
        int row = matrix.length, col = matrix[0].length;
        int start = 0, end = row*col-1;
        while(start != end){
            int mid = (start + end - 1) / 2;
            if(matrix[mid/row][mid%row] < target){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return matrix[end/row][end%row] == target;
    }
}
