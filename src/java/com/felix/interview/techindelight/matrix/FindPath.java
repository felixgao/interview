package com.felix.interview.techindelight.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.techiedelight.com/find-all-paths-from-source-to-destination-in-matrix/
 *
 */
public class FindPath {
    private static final int[][] LEFTANDDOWNDIRS = new int[][] {{0, 1}, {1, 0}};
    public List<String> pathFromUpperLeftToLowerRight(int[][] matrix){
        List<String> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int row = matrix.length-1, col = matrix[0].length-1;
        traverseMatrix(matrix, result, path, 0, 0, row, col);
        return  result;
    }

    private void traverseMatrix(int[][] matrix, List<String> result, List<Integer> path, int u, int v, int row, int col) {
        if(u > row || v > col) {
            return;
        }
        if(u == row && v == col){
            path.add(matrix[u][v]);
            result.add(path.stream().map(Object::toString).collect(Collectors.joining("->")));
            path.remove(path.size() -1);
            return;
        }

        path.add(matrix[u][v]);
        for(int[] dir : LEFTANDDOWNDIRS){
           traverseMatrix(matrix, result, path, u+dir[0], v+dir[1], row, col);
        }
        path.remove(path.size()-1);
    }
}
