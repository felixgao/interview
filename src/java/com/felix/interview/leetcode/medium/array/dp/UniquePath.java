package com.felix.interview.leetcode.medium.array.dp;

import java.util.Arrays;

/**
 * Created by felix on 2/3/17.
 * https://leetcode.com/problems/unique-paths/
 * 62
 */
public class UniquePath {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row: memo)
            Arrays.fill(row, 1);
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                memo[i][j] = memo[i-1][j] + memo[i][j-1];
            }
        }
        return memo[m-1][n-1];
    }

    public int uniquePathsOptimized(int m, int n) {
        if (m > n) return uniquePathsOptimized(n, m);
        int[] memo = new int[m];
        Arrays.fill(memo, 1);
        for (int j = 1; j < n; j++) {
            for (int i = 1; i < m; i++) {
                memo[i] += memo[i -1];
            }
        }
        return memo[m - 1];
    }
}
