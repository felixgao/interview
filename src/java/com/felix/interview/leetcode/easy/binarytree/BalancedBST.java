package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 110
 * https://leetcode.com/problems/balanced-binary-tree/#/description
 */
public class BalancedBST {
    //Top down approach
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = BstDepth(root.left);
        int right = BstDepth(root.right);
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int BstDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = BstDepth(node.left);
        int right = BstDepth(node.right);
        return Math.max(left, right) + 1;
    }

    public boolean isBalancedDfs(TreeNode root){
        return dfsHeight(root) != -1;
    }

    private int dfsHeight(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = dfsHeight(node.left);
        if(left == -1) return left;
        int right = dfsHeight(node.right);
        if(right == -1) return right;
        if (Math.abs(left - right) > 1)  return -1;
        return Math.max(left, right) + 1;
    }
}
