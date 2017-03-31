package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/18/17.
 * 98
 * https://leetcode.com/problems/validate-binary-search-tree/#/description
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long min, long max){
        if(node == null) return true;
        if(node.val < min || node.val > max){
            return false;
        } else {
            return isValidBST(node.left, min, node.val) &&
                    isValidBST(node.right, node.val, max);
        }
    }
}
