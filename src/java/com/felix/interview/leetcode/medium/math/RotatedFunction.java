package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/14/17.
 * 396
 * https://leetcode.com/problems/rotate-function/
 * F(k) = F(k-1) + sum - nBk[0]
 */
public class RotatedFunction {
    public int maxRotateFunction(int[] A) {
        int len = A.length, sum = 0;
        int Fsum = 0;
        for(int i = 0; i < len; i++){
            Fsum += i * A[i];
            sum += A[i];
        }
        int max = Fsum;
        for(int i = len-1; i >= 0; i--){
            Fsum = Fsum + sum - i*A[i];
            max = Math.max(max, Fsum);
        }
        return max;
    }
}
