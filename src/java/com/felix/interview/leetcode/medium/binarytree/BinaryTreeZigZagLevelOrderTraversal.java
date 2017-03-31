package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/11/17.
 * 103
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/?tab=Description
 */
public class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        recursiveTraversal(root, result, 0);
        return result;
    }

    private void recursiveTraversal(TreeNode node, List<List<Integer>> result, int level) {
        if(node == null) return;
        if(result.size() <= level){
            result.add(new ArrayList<>());
        }
        List<Integer> list = result.get(level);
        if(level % 2 == 0) list.add(node.val);
        else list.add(0, node.val);

        recursiveTraversal(node.left, result, level+1);
        recursiveTraversal(node.right, result, level+1);
    }
}
