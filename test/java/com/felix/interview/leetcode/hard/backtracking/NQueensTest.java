package com.felix.interview.leetcode.hard.backtracking;

import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/9/17.
 */
public class NQueensTest {
    NQueens n = new NQueens();

    @Test
    public void test(){
        System.out.println(n.solveNQueens(4));
    }
}
