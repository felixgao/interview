package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 1/30/17.
 * 289
 * https://leetcode.com/problems/game-of-life/
 *
 *
 Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 Any live cell with two or three live neighbors lives on to the next generation.
 Any live cell with more than three live neighbors dies, as if by over-population..
 Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

 [2nd bit, 1st bit] = [next state, current state]

 - 00  dead (next) <- dead (current)
 - 01  dead (next) <- live (current)
 - 10  live (next) <- dead (current)
 - 11  live (next) <- live (current)
 *
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int neighbors = findLiveNeighbors(board, m, n, i, j);
                //don't need to do anything for entries that is going to be dead because it will be shifted later
                if ( (board[i][j] & 1) == 0 && neighbors == 3){ //set next to live, reproduction
                    board[i][j] |= 2;
                }else if ( neighbors >= 2 && neighbors <=3){ // set to live, next generation
                    board[i][j] |= 2;
                }else if ( (board[i][j] & 1) == 1 && neighbors > 3){ //over population
                    board[i][j] &= 1;
                }
            }
        }
        //move to next iteration
        for(int i = 0; i<m; i++){
            for(int j =0; j<n; j++){
                board[i][j] >>=1;
            }
        }

    }

    //Board, size of board (row x col) m,n, current location (i,j)
    private int findLiveNeighbors(int[][] board, int m, int n, int i, int j){
        int liveNieghborCounts = 0;
        for(int u = Math.max(i - 1, 0); u <= Math.min(i + 1, m - 1); u++){
            for(int v = Math.max(j - 1, 0); v <= Math.min(j + 1, n - 1); v++){
                liveNieghborCounts += board[u][v] & 1;
            }
        }
        //remove the current position's contribution if it is live
        liveNieghborCounts -= board[i][j] & 1;
        return liveNieghborCounts;
    }
}
