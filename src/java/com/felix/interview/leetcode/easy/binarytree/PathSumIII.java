package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 3/12/17.
 * 437
 * https://leetcode.com/problems/path-sum-iii/#/description
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        //stores the prefix sum
        // key : the prefix sum, value : how many ways get to this prefix sum
        Map<Integer, Integer> preSum = new HashMap();
        preSum.put(0,1);
        return helper(root, 0, sum, preSum);
    }

    private int helper(TreeNode node, int currentSum, int target, Map<Integer, Integer> preSum) {
        if(node == null) return 0;
        currentSum += node.val;
        int res = preSum.getOrDefault(currentSum - target, 0);
        preSum.compute(currentSum, (key, value) -> value == null ? 0 : value + 1 );
        res += helper(node.left, currentSum, target, preSum) +
                helper(node.right, currentSum, target, preSum);
        preSum.compute(currentSum, (k, v) -> v -1);
        return res;
    }
}
