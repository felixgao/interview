package com.felix.interview.leetcode.medium.dp;

import com.felix.interview.leetcode.medium.array.dp.UniquePath;
import org.junit.Test;

/**
 * Created by felix on 3/5/17.
 */
public class UniqueBinarySearchTreeTest {
    UniqueBinarySearchTree u = new UniqueBinarySearchTree();

    @Test
    public void test1(){
        System.out.println(u.numTrees(3));
        System.out.println(u.numTrees(4));
        System.out.println(u.numTrees(5));
    }
}
