package com.felix.interview.leetcode.medium.array.dp;

/**
 * Created by felix on 3/24/17.
 * the first element is the house name, the second element is color r, g, b
 */
public class PaintHouse {
    public int minCost(int[][] costs) {
        if(costs == null || costs.length == 0) return 0;
        int r = 0, g = 0, b = 0;
        for(int[] cost : costs){
            int tempR = cost[0] + Math.min(g, b);
            int tempG = cost[1] + Math.min(r, b);
            int tempB = cost[2] + Math.min(r, g);
            r = tempR; g = tempG; b = tempB;
        }
        return Math.min(r, Math.min(g, b));
    }
}
