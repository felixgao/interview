package com.felix.interview.leetcode.hard.dfs;

/**
 * Created by felix on 3/19/17.
 * 514
 * https://leetcode.com/problems/freedom-trail/#/description
 */
public class FreedomTrail {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        int[][] memo = new int[m+1][n];

        for(int i = m-1; i >=0; i--){
            for(int j = 0; j < n; j++){
                memo[i][j] = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++){
                    if(ring.charAt(k) == key.charAt(i)){
                        //find the distance between current char and char we are interested
                        int diff = Math.abs(j-k);
                        //the minimum steps is either going one way(diff) or the otherway (n-diff)
                        int steps = Math.min(diff, n - diff);
                        memo[i][j] = Math.min(memo[i][j], steps + memo[i + 1][k]);
                    }
                }
            }
        }
        return memo[0][0] + m;
    }
}
