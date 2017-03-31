package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/18/17.
 * 113
 * https://leetcode.com/problems/path-sum-ii/#/description
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>(), result);
        return result;
    }

    private void pathSum(TreeNode node, int sum, List<Integer> accList, List<List<Integer>> result) {
        if (node == null) {
            return;
        }
        accList.add(node.val);
        if(node.val == sum && node.left == null && node.right == null){
            result.add(new ArrayList<>(accList));
            accList.remove(accList.size() - 1);
            return;
        } else if ( 0 > sum ){
            return;
        } else {
            pathSum(node.left, sum - node.val, accList, result);
            pathSum(node.right, sum - node.val, accList, result);
        }
        accList.remove(accList.size() - 1);
    }
}
