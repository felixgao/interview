package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

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
public class PathSumIITest {
    PathSumII p = new PathSumII();

    @Test
    public void test(){
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(8);

        TreeNode node3 = new TreeNode(11);
        TreeNode node4 = new TreeNode(13);
        TreeNode node5 = new TreeNode(4);

        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(2);
        TreeNode node8 = new TreeNode(5);
        TreeNode node9 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;
        System.out.println(p.pathSum(root, 22));
    }
}
