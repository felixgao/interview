package com.felix.interview.techindelight.backtracking;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/9/17.
 */
public class LongestPossibleRouteInMatrixTest {
    LongestPossibleRouteInMatrix l = new LongestPossibleRouteInMatrix();
    @Test
    public void test(){
        int[][] mat = new int[][]
        {
            { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
            { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
            { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
            { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
            { 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
        };
        out.println(l.findLongestPossibleRoute(mat, 0,0, 5,7));

    }
}
