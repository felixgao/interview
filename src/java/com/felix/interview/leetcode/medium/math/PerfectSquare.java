package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/18/17.
 * 367
 * https://leetcode.com/problems/valid-perfect-square/?tab=Description
 * all perfect squares are made of the following rules
 1 = 1
 4 = 1 + 3
 9 = 1 + 3 + 5
 16 = 1 + 3 + 5 + 7
 25 = 1 + 3 + 5 + 7 + 9
 36 = 1 + 3 + 5 + 7 + 9 + 11
 ....
 so 1+3+...+(2n-1) = (2n-1 + 1)n/2 = nn
 *
 * Run time is O(Sqrt(N))
 */
public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        int odd = 1;
        while(num > 0){
            num -= odd;
            odd += 2;
        }
        return num == 0;
    }
}
