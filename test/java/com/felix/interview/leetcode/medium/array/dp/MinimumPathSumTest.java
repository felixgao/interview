package com.felix.interview.leetcode.medium.array.dp;

import com.felix.interview.leetcode.medium.array.dp.MinimumPathSum;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/3/17.
 */
public class MinimumPathSumTest {

    @Test
    public void test(){
        int[][] g = new int[][]{
                {1,3,5,7},
                {2,4,6,8},
                {1,2,3,4},
                {5,6,7,8},
        };
        MinimumPathSum m = new MinimumPathSum();
        System.out.println(m.minPathSum(g));
    }

}
