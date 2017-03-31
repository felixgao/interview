package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 111
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/#/description
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode node, int level) {
        if(node == null){
            return level;
        }
        return Math.min(
                minDepth(node.left, level + 1),
                minDepth(node.right, level + 1)
                );
    }

    public int minDepth2(TreeNode root){
        if (root == null)	return 0;
        if (root.left == null)	return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }
}
