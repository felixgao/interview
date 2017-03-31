package com.felix.interview.leetcode.hard.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/18/17.
 * https://leetcode.com/problems/most-frequent-subtree-sum/
 * 508
 */
public class BinaryTreeMaximumPathSum {
    private Integer Max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        Max = Integer.MIN_VALUE;
        maxPathDown(root);
        return Max;
    }

    private int maxPathDown(TreeNode node) {
        if(node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        Max = Math.max(Max,  node.val + left + right);
        return Math.max(left, right) + node.val;
    }

}
