package com.felix.interview.leetcode.medium;

import com.felix.interview.leetcode.medium.bitmanipulation.MaximumXOROfTwoNumbers;
import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/2/17.
 */
public class MaximumXOROfTwoNumbersTest {
    MaximumXOROfTwoNumbers m = new MaximumXOROfTwoNumbers();

    @Test
    public void test1(){
        out.println(m.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
    }
}
