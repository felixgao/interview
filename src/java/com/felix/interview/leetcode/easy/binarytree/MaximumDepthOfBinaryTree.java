package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 111
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/#/description
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode node, int level) {
        if(node == null){
            return level;
        }
        return Math.max(
                maxDepth(node.left, level + 1),
                maxDepth(node.right, level + 1)
                );
    }

    public int minDepth2(TreeNode root){
        if (root == null)	return 0;
        if (root.left == null)	return maxDepth(root.right) + 1;
        if (root.right == null) return maxDepth(root.left) + 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
