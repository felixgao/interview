package com.felix.interview.techindelight.array;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/8/17.
 */
public class MaximumSubarrayTest {
    MaximumSubarray m = new MaximumSubarray();
    @Test
    public void test(){
        out.println(m.kadane(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
