package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/18/17.
 */
public class Pow {
    public double myPow(double x, int n) {
        if (n == 0 ){
            return 1;
        }
        if (n < 0){
            x = 1/x;
            n = -n;
        }
        return (n % 2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}
