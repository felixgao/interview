package com.felix.interview.leetcode.medium.dp;

import org.junit.Test;

/**
 * Created by felix on 3/1/17.
 */
public class CountingNumberOfUniqueDigitsTest {
    CountingNumberOfUniqueDigits c = new CountingNumberOfUniqueDigits();

    @Test
    public void test(){
        for(int i = 1; i < 13; i++){
            System.out.println("i="+i+" "+c.countNumbersWithUniqueDigits(i));
        }
    }
}
