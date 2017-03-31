package com.felix.interview.leetcode.medium.array.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/3/17.
 * 64
 * https://leetcode.com/problems/minimum-path-sum/
 *
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int col = grid.length, row = grid[0].length;
        int[] cur = new int[col];
        Arrays.fill(cur, grid[0][0]);
        for (int i = 1; i < col; i++)
            cur[i] = cur[i - 1] + grid[i][0];

        for(int j = 1; j < row; j++){
            cur[0] += grid[0][j];
            for(int i = 1; i < col; i++){
                cur[i] = Math.min(cur[i - 1], cur[i]) + grid[i][j];
            }
        }
        return cur[col-1];
    }
}
