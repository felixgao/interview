package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/15/17.
 * 95
 * https://leetcode.com/problems/unique-binary-search-trees-ii/#/description
 */
public class UniqueBinarySearchTreeII {
    public List<TreeNode> generateTrees(int n) {
        return genTreeList(1, n);
    }

    private List<TreeNode> genTreeList (int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if(start > end){
            result.add(null);
        }
        for(int idx = start; idx <= end; idx++){
            List<TreeNode> leftNodeList = genTreeList(start, idx -1);
            List<TreeNode> rightNodeList = genTreeList(idx+1, end);
            for(TreeNode left : leftNodeList){
                for(TreeNode right : rightNodeList){
                    TreeNode root = new TreeNode(idx);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
