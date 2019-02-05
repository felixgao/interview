package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/15/17.
 * 236
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/#/description
 */
public class LowestCommonAncestorBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //the base base when the root is null or either p or q is the LCA
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);
        if(left != null && right != null)   return root;
        return left != null ? left : right;
    }
}
