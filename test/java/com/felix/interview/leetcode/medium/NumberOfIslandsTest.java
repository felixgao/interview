package com.felix.interview.leetcode.medium;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/10/17.
 */
public class NumberOfIslandsTest {
    NumberOfIslands n = new NumberOfIslands();

    @Test
    public void test(){
        System.out.println(n.numIslands(new char [][] {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        }));
    }
}
