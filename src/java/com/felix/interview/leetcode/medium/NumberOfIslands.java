package com.felix.interview.leetcode.medium;

/**
 * Created by felix on 3/9/17.
 * 200
 * https://leetcode.com/problems/number-of-islands/?tab=Description
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        if(grid == null) return islandCount;
        int row = grid.length, col = grid[0].length;
        char[][] copy = deepCopy(grid);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(copy[i][j] == '1'){
                    DFSMarkAndRemove(copy, i, j, row, col);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    private char[][] deepCopy(char[][] grid){
        if (grid == null) return null;
        int m = grid.length, n = grid[0].length;
        final char[][] copy = new char[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                copy[i][j] = grid[i][j];
            }
        }
        return copy;
    }

    private void DFSMarkAndRemove(char[][] grid, int row, int col, int MaxRow, int MaxCol){
        if(row < 0 || col < 0 || row >= MaxRow || col >=MaxCol || grid[row][col] != '1'){
            return;
        }
        grid[row][col] = '0';
        DFSMarkAndRemove(grid, row, col+1, MaxRow, MaxCol);
        DFSMarkAndRemove(grid, row, col-1, MaxRow, MaxCol);
        DFSMarkAndRemove(grid, row+1, col, MaxRow, MaxCol);
        DFSMarkAndRemove(grid, row-1, col, MaxRow, MaxCol);
    }
}
