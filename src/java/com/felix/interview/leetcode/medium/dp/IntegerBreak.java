package com.felix.interview.leetcode.medium.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 3/5/17.
 * 343
 * https://leetcode.com/problems/integer-break/?tab=Description
 *
 *
 * (d)/(dx)(x^(n/x)) = -n x^(n/x - 2) (ln(x) - 1)
 * when we solve for the above equation = 0, to maximize or minimize the derivatives, x = e
 * which means a number between 2 or 3 yeilds the max result
 * we prefer to take a multiples of 3 before taking a multiples of 2 because 2^3 = 8 while 3^2 = 9
 *
 *
 *
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if(n < 1) return -1; // this case should never happen based on question assumption
        if(n == 2) return 1;
        if(n == 3) return 2;
        int res = 1;
        //for all numbers greater than 4
        while( n > 4 ){
            res *= 3;
            n -= 3;
        }
        //we must have a number between 1 and 4 left over, in this case, it is best to just multiply the left over with the result
        res *= n;
        return res;
    }
}
