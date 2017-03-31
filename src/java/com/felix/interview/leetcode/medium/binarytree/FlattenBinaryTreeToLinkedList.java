package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/16/17.
 * 114
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/#/description
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode node, TreeNode prev){
        if(node == null) return prev;
        prev = flatten(node.right, prev);
        prev = flatten(node.left, prev);
        node.right = prev;
        node.left = null;
        prev = node;
        return prev;
    }
}
