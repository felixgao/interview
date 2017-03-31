package com.felix.interview.leetcode.medium.array.dp;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 2/4/17.
 */
public class UniquePathIITest {

    @Test
    public void test(){
        int[][] g = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        UniquePathII u = new UniquePathII();
        System.out.println(u.uniquePathsWithObstacles(g));
    }

    @Test
    public void test2(){
        int[][] g = new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0}
        };
        UniquePathII u = new UniquePathII();
        System.out.println(u.uniquePathsWithObstacles(g));
    }

}
