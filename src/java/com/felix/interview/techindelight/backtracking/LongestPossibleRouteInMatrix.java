package com.felix.interview.techindelight.backtracking;

import java.util.Arrays;

/**
 * Created by felix on 4/9/17.
 */
public class LongestPossibleRouteInMatrix {
    private static final int[][] DIRECTION = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int findLongestPossibleRoute(int[][] matrix, int startX, int startY, int endX, int endY){
        boolean[][] visit = new boolean[matrix.length][matrix[0].length];
        return DFS(matrix, visit, startX, startY, endX, endY, 0,0);

    }

    private int DFS(int[][] matrix, boolean[][] visited, int startX, int startY, int endX, int endY, int max, int steps) {
        if(startX < 0 || startY < 0 || startX >= matrix.length || startY >= matrix[startX].length
                || visited[startX][startY] || matrix[startX][startY] != 1){
            return max;
        }
        if(startX == endX && startY == endY){
            return steps;
        }
        visited[startX][startY] = true;
        int newMax = max;
        for(int[] dir : DIRECTION){
            newMax = Math.max(newMax, DFS(matrix, visited, startX + dir[0], startY+dir[1], endX, endY, newMax, steps + 1));
        }
        visited[startX][startY] = false;
        return newMax;
    }
}
