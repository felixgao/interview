package com.felix.interview.techindelight.matrix;

import org.junit.Test;

import static java.lang.System.out;

/**
 * Created by felix on 4/16/17.
 */
public class FindPathTest {
    FindPath f = new FindPath();

    @Test
    public void testMatrixTopLeftToBottomRight(){
        out.println(f.pathFromUpperLeftToLowerRight(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        }));
    }
}
