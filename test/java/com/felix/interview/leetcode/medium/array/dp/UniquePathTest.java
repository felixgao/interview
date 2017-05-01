package com.felix.interview.leetcode.medium.array.dp;

import org.junit.Test;

/**
 * Created by felix on 2/3/17.
 */
public class UniquePathTest {

    @Test
    public void test(){
        UniquePath u = new UniquePath();
        System.out.println(u.uniquePaths(3, 7));
    }

    @Test
    public void testOptimized(){
        UniquePath u = new UniquePath();
        System.out.println(u.uniquePathsOptimized(3, 7));
    }

}
