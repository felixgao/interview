package com.felix.interview.leetcode.hard.dp;

import java.util.Arrays;

/**
 * Created by felix on 2/22/17.
 * 174
 * https://leetcode.com/problems/dungeon-game/?tab=Description
 */
public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length, col = dungeon[0].length;
        int[][] memo = new int[row][col];
        //prime the last element to be either 1 or the negative damage value + 1 to maintain the hero to be alive
        memo[row-1][col-1] = Math.max(1, 1 - dungeon[row-1][col-1]);
        for(int i = row-2; i >=0; i--){
            //going up the matrix to compute the health needed at each step
            memo[i][col-1] = Math.max(1, memo[i+1][col-1] - dungeon[i][col-1]);
        }
        for(int j = col-2; j >=0; j--){
            //going left of the matrix compute the health needed at each step
            memo[row-1][j] = Math.max(1, memo[row-1][j+1] - dungeon[row-1][j]);
        }
        for(int i = row - 2; i >=0; i--){
            for(int j = col - 2; j >=0; j--){
                memo[i][j] = Math.min(
                  Math.max(1, memo[i+1][j] - dungeon[i][j]), //Down
                  Math.max(1, memo[i][j+1] - dungeon[i][j])  //Right
                );
            }
        }
        return memo[0][0];
    }
}
