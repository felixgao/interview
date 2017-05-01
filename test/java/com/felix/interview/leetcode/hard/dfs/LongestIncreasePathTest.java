package com.felix.interview.leetcode.hard.dfs;

import org.junit.Test;

/**
 * Created by felix on 3/18/17.
 */
public class LongestIncreasePathTest {
    LongestIncreasingPathInMatrix l = new LongestIncreasingPathInMatrix();

    @Test
    public void test1(){
        System.out.println(l.longestIncreasingPath(new int[][]{
                {9,9,4},
                {6,6,8},
                {2,1,1}
        }));
    }

    @Test
    public void test2(){
        System.out.println(l.longestIncreasingPath(new int[][]{
                {3,4,5},
                {3,2,6},
                {2,1,1}
        }));
    }
}
