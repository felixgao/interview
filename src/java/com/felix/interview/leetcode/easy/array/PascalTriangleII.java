package com.felix.interview.leetcode.easy.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 1/29/17.
 * 119
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new LinkedList<>();
        row.add(1);
        if(rowIndex == 1){
           return row;
        }
        row.add(1);
        if(rowIndex == 2){
           return row;
        }
        for(int k = 2; k<rowIndex; k++) {
            //append the first element and then from second element to the second to last element add them
            row.add(0, 1);
            for (int i = 1; i < row.size() -1; i++) {
                //(i) + (i+1) is because we prepended a 1, so the original data starts at position 1
                //since we never reaches row.size(), the last 1 is preserved
                row.set(i, row.get(i)+row.get(i+1));
            }
        }
        return row;
    }
}
