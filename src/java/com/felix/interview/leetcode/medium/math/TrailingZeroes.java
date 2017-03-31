package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/18/17.
 * 172
 * https://leetcode.com/problems/factorial-trailing-zeroes/?tab=Description
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while(n > 5){
            n /= 5;
            zeroes += n;
        }
        return zeroes;
    }
}
