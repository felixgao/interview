package com.felix.interview.leetcode.medium.array;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/4/17.
 */
public class CombinationSumIITest {
    CombinationSumII c = new CombinationSumII();

    @Test
    public void test(){
        //For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
        System.out.println(c.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
