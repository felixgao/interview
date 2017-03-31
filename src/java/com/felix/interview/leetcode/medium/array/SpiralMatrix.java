package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 2/4/17.
 * 54
 * https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList(matrix.length * matrix[0].length);
        int rowBegin = 0, rowEnd = matrix.length-1, colBegin = 0, colEnd = matrix[0].length-1;
        while (rowBegin < rowEnd && colBegin < colEnd){
            //going colBegin to colEnd on the rowBegin row
            for(int j = colBegin; j <= colEnd; j++){
                list.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            //going rowBegin to rowEnd from the colEnd
            for(int i = rowBegin; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin <= rowEnd) {
                //moving from colEnd to colBegin from the rowEnd
                for (int j = colEnd; j >= colBegin; j--) {
                    list.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            if(colBegin <= colEnd) {
                //moving from rowEnd to rowBegin on the colBegin
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return list;
    }
}
