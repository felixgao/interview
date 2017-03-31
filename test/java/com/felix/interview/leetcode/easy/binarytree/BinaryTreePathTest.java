package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/12/17.
 */
public class BinaryTreePathTest {
    BinaryTreePath b = new BinaryTreePath();

    @Test
    public void test(){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        System.out.println(b.binaryTreePaths(node1));
    }
}
