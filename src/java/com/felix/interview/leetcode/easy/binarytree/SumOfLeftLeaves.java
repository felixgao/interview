package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 404
 * https://leetcode.com/problems/sum-of-left-leaves/#/description
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return returnLeftLeaves(root, false);
    }

    private int returnLeftLeaves(TreeNode node, boolean isLeft){
        if(isLeft && (node.left == null && node.right == null)){
            return node.val;
        } else if (node == null){
            return 0;
        }
        return returnLeftLeaves(node.left, true) + returnLeftLeaves(node.right, false);
    }
}
