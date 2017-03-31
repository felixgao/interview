package com.felix.interview.leetcode.hard.dp;

import com.felix.interview.leetcode.medium.math.ArithmeticSlices;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/26/17.
 */
public class AirthmeticSlicesIITest {
    ArithmeticSlicesII a = new ArithmeticSlicesII();

    @Test
    public void test1(){
        System.out.println(a.numberOfArithmeticSlices(new int [] {2, 4, 6, 8, 10}));
    }
}
