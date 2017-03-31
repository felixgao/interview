package com.felix.interview.leetcode.hard.dfs;

/**
 * Created by felix on 3/18/17.
 * 329
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/#/description
 */
public class LongestIncreasingPathInMatrix {
    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int longestIncreasingPath(int[][] matrix) {
        int max = -1;
        int M = matrix.length, N = matrix.length;
        int[][] cache = new int[M][N];

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                max = Math.max(max, longestIncreasingPath(matrix, i, j, cache));
            }
        }
        return max;
    }

    private int longestIncreasingPath(int[][] matrix, int curRow, int curCol, int[][] cache){
        if(cache[curRow][curCol] != 0 ) return cache[curRow][curCol];
        int max = 1;

        for(int[] d : dirs){
            int x = curRow + d[0], y = curCol + d[1];
            if(x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] <= matrix[curRow][curCol]){
                continue;
            }
            int len = 1 + longestIncreasingPath(matrix, x, y , cache);
            max = Math.max(max, len);
        }
        return max;
    }

    private int longestIncreasingPath(int[][] matrix,  int row, int col, long curVal) {
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length ||
                matrix[row][col] <= curVal
                ){
            return 0;
        }
//        visited[row][col] = true;
        int maxSoFar = 1;
        int path = Math.max(
                Math.max(longestIncreasingPath(matrix, row - 1, col, matrix[row][col]),
                        longestIncreasingPath(matrix, row + 1, col, matrix[row][col])),
                Math.max(longestIncreasingPath(matrix, row, col - 1, matrix[row][col]),
                        longestIncreasingPath(matrix, row, col + 1, matrix[row][col])
                        )
        );
        return maxSoFar + path;
    }
}
