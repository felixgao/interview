package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by felix on 3/18/17.
       5
      / \
     4   8
    /   / \
   11  13  4
  /  \    / \
 7    2  5   1
 *
 *
 */
public class MostFrequentSubtreeSumTest {
    MostFrequentSubtreeSum m = new MostFrequentSubtreeSum();

    @Test
    public void test(){
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(-5);

        root.left = node1;
        root.right = node2;

        System.out.println(Arrays.toString(m.findFrequentTreeSum(root)));

        TreeNode node3 = new TreeNode(-3);
        root.right = node3;
        System.out.println(Arrays.toString(m.findFrequentTreeSum(root)));
    }
}
