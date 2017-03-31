package com.felix.interview.leetcode.medium.math;

/**
 * Created by felix on 2/14/17.
 * 397
 * https://leetcode.com/problems/integer-replacement/
 */
public class IntegerReplacement {
    public int integerReplacement(int n) {
        int steps = 0;
        while(n != 1){
            if(n%2 == 0){
                n >>=1;
            } else if (Integer.bitCount(n + 1) > Integer.bitCount(n - 1)){
                n -=1;
            } else {
                n +=1;
            }
            steps++;
        }
        return steps;
    }
}
