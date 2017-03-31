package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 3/15/17.
 * 102
 * https://leetcode.com/problems/binary-tree-level-order-traversal/#/description
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, 0, result);
        return result;
    }

    private void levelOrder(TreeNode node, int level, List<List<Integer>> result) {
        if(node == null){
            return;
        }
        if(level >= result.size()){
            result.add(new LinkedList<>());
        }
        List<Integer> list = result.get(level);
        list.add(node.val);
        levelOrder(node.left, level + 1, result);
        levelOrder(node.right, level + 1, result);
    }
}
