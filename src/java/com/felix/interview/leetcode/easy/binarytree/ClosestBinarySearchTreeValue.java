package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/25/17.
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int r = helper(root, target, Double.MAX_VALUE, root.val);
        return r;
    }

    private int helper(TreeNode node, double target, double maxDiff, int minSoFar) {
        if(node == null) return minSoFar;
        double diff = Math.abs(node.val - target);
        if(diff < maxDiff) {
            maxDiff = diff;
            minSoFar = node.val;
        }

        if(target < node.val){
            return helper(node.left, target, maxDiff, minSoFar);
        } else {
            return helper(node.right, target, maxDiff, minSoFar);
        }
    }
}
