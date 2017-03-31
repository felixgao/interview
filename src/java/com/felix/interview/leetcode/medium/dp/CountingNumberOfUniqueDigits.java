package com.felix.interview.leetcode.medium.dp;

/**
 * Created by felix on 3/1/17.
 * 357
 * https://leetcode.com/problems/count-numbers-with-unique-digits/?tab=Description
 *
 * n = 1  -> 0,1,2,3,4,5,6,7,8,9 -> total of 10
 * n = 2  -> 9 * 9 + f(1)        -> total of 81 + 10
 * n = 3  -> 9 * 9 * 8 + f(2) + f(1)
 *
 *
 */
public class CountingNumberOfUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n <= 0) return 0;
        int res = 10, multiplier = 9, accumlator = 9;

        while(n-- > 1 && multiplier > 0){
            accumlator *= multiplier;
            res += accumlator;
            multiplier--;
        }
        return res;
    }
}
