package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 112
 * https://leetcode.com/problems/path-sum/#/description
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return recursivePathSum(root, sum);
    }

    private boolean recursivePathSum(TreeNode node, int target){
        if(target == 0 && node == null){
            return true;
        } else if (target != 0 && node == null){
            return false;
        }

        return recursivePathSum(node.left, target - node.val) ||
                recursivePathSum(node.right, target - node.val);
    }
}
