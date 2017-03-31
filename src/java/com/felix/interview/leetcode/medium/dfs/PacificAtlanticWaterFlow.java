package com.felix.interview.leetcode.medium.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by felix on 3/18/17.
 * 417
 * https://leetcode.com/problems/pacific-atlantic-water-flow/#/description
 * Given the following 5x5 matrix:
 * <p>
 * Pacific ~   ~   ~   ~   ~
 * ~  1   2   2   3  (5) *
 * ~  3   2   3  (4) (4) *
 * ~  2   4  (5)  3   1  *
 * ~ (6) (7)  1   4   5  *
 * ~ (5)  1   1   2   4  *
 * *   *   *   * Atlantic
 * <p>
 * Return:
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
 */
public class PacificAtlanticWaterFlow {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (pacificFlow(matrix, i, j, matrix[i][j]) &&
                        atlanticFlow(matrix, i, j, matrix[i][j])
                        ) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }

    private boolean pacificFlow(int[][] matrix, int row, int col, int from) {
        if ((row <= 0 && col <= matrix[0].length) ||
                (col <= 0 && row <= matrix.length)) {
            return true;
        }
        if (matrix[row][col] <= from) {
            return pacificFlow(matrix, row - 1, col, matrix[row][col]) ||
                    pacificFlow(matrix, row, col - 1, matrix[row][col]);
        } else {
            return false;
        }
    }

    private boolean atlanticFlow(int[][] matrix, int row, int col, int from) {
        if ((row >= matrix.length && col <= matrix[0].length) ||
                (col >= matrix[0].length && row <= matrix.length)) {
            return true;
        }
        if (matrix[row][col] <= from) {
            return atlanticFlow(matrix, row + 1, col, matrix[row][col]) ||
                    atlanticFlow(matrix, row, col + 1, matrix[row][col]);
        } else {
            return false;
        }
    }
    /*******
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int n = matrix.length, m = matrix[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            dfs(matrix, pacific, Integer.MIN_VALUE, i, 0);
            dfs(matrix, atlantic, Integer.MIN_VALUE, i, m - 1);
        }
        for (int i = 0; i < m; i++) {
            dfs(matrix, pacific, Integer.MIN_VALUE, 0, i);
            dfs(matrix, atlantic, Integer.MIN_VALUE, n - 1, i);
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (pacific[i][j] && atlantic[i][j])
                    res.add(new int[]{i, j});
        return res;
    }

    int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void dfs(int[][] matrix, boolean[][] visited, int height, int x, int y) {
        int n = matrix.length, m = matrix[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m || visited[x][y] || matrix[x][y] < height)
            return;
        visited[x][y] = true;
        for (int[] d : dir) {
            dfs(matrix, visited, matrix[x][y], x + d[0], y + d[1]);
        }
    }
     */

}
