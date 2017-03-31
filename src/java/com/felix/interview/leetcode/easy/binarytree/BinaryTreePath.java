package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/12/17.
 * 257
 * https://leetcode.com/problems/binary-tree-paths/#/description
 */
public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        recursivePath(root, list, "");
        return list;
    }

    private void recursivePath(TreeNode node, List<String> list, String path) {
        if(node == null) return;
        if(node.left == null && node.right == null){ //is child
            list.add(path+node.val);
        } else {
            recursivePath(node.left, list, path+node.val+"->");
            recursivePath(node.right, list, path+node.val+"->");
        }
    }
}
