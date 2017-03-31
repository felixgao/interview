package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/18/17.
 * 515
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row/#/description
 */
public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        largestValues(root, 0, result);
        return result;
    }

    private void largestValues(TreeNode node, int level, List<Integer> result) {
        if(node == null) return;
        //first time we encounter this level
        if(level >= result.size()){
            result.add(node.val);
        }
        result.set(level, Math.max(node.val, result.get(level)));
        largestValues(node.left, level + 1, result);
        largestValues(node.right, level + 1, result);
    }
}
