package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/15/17.
 * 199
 * https://leetcode.com/problems/binary-tree-right-side-view/#/description
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSideView(root, result);
        return result;
    }

    private void rightSideView(TreeNode node, List<Integer> result) {
        if(node == null) return;
        result.add(node.val);
        if(node.right == null){
            rightSideView(node.left, result);
        } else {
            rightSideView(node.right, result);
        }
    }

}
