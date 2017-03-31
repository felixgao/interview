package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 3/12/17.
 * 107
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/?tab=Description
 */
public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        recursiveBinaryTreeTraversal(root, list, 0);
        return list;
    }

    private void recursiveBinaryTreeTraversal(TreeNode node, List<List<Integer>> result, int level){
        if(node == null) return;
        if(level >= result.size()){
            result.add(0, new LinkedList<>());
        }
        List<Integer> list = result.get(result.size() - level - 1);
        list.add(node.val);
        recursiveBinaryTreeTraversal(node.left, result, level + 1);
        recursiveBinaryTreeTraversal(node.right, result, level + 1);
    }
}
