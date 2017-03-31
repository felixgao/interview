package com.felix.interview.leetcode.hard.dfs;

import com.felix.interview.leetcode.medium.bfs.SurroundedRegions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 3/19/17.
 */
public class SurrendedRegionsTest {
    SurroundedRegions s = new SurroundedRegions();

    @Test
    public void test(){
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
        };
        s.solve(board);
        for(char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
