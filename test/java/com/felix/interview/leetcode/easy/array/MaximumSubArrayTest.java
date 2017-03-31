package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.MaximumSubArray;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 1/29/17.
 */
public class MaximumSubArrayTest {

    @Test
    public void test(){
        MaximumSubArray sum = new MaximumSubArray();
        System.out.println(sum.maxSubArray(new int[]{
                -2,1,-3,4,-1,2,1,-5,4
        }));
    }
}
