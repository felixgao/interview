package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/14/17.
 * 413
 * https://leetcode.com/problems/arithmetic-slices/
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0, sum = 0;
        for(int i = 2; i < A.length; i++){
            if(A[i]-A[i-1] == A[i-1]-A[i-2]){
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}
