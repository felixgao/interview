package com.felix.interview.leetcode.medium.bfs;

/**
 * Created by felix on 3/19/17.
 * 130
 * https://leetcode.com/problems/surrounded-regions/#/description

 X X X X                X X X X
 X O O X                X X X X
 X X O X      -->       X X X X
 X O X X                X O X X

 Solution:
 1) mark all edge node and its neighors that are 'O' to '1'
 2) go through all nodes that are 'O' change it to 'X' because it is surrounded
 3) mark all nodes that are '1' to 'O' because it is not surrounded

 */
public class SurroundedRegions {
    private static final int[][] dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 0 || j == n-1 || i == 0 || i == m -1) {
                    markEdge(board, i, j, m, n, '1');
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                markEdge(board, i, j, m, n, 'O');
            }
        }

    }

    private void markEdge(char[][] board, int i , int j, int m, int n, char val){
        if(i < 0 || j < 0 || i >= m || j >= n || board[i][j] == 'X') return;

        board[i][j] = val;
        for(int[] dir : dirs){
            int x = i + dir[0], y = j + dir[1];
            markEdge(board, x, y, m, n, val);
        }
    }
}
