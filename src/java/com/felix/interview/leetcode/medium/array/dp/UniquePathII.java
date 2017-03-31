
package com.felix.interview.leetcode.medium.array.dp;

/**
 * Created by felix on 2/4/17.
 * 63
 * https://leetcode.com/problems/unique-paths-ii/
 */
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] memo = new int[obstacleGrid[0].length];
        memo[0] = 1;
        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < obstacleGrid[i].length; j++){
                if(obstacleGrid[i][j] == 1){
                    memo[j] = 0;
                } else if (j > 0) {
                    memo[j] += memo[j - 1];
                }
            }
        }
        return memo[memo.length-1];
    }
}
