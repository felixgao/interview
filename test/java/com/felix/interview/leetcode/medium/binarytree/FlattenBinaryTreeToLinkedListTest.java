package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.Test;

/**
 * Created by felix on 3/17/17.
 */
public class FlattenBinaryTreeToLinkedListTest {
    FlattenBinaryTreeToLinkedList f = new FlattenBinaryTreeToLinkedList();

    @Test
    public void test(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);

        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);

        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        node3.right = node6;
        f.flatten(node1);
        while(node1.right != null) {
            System.out.println(node1.val);
            node1 = node1.right;
        }
    }
}
