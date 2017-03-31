package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by felix on 3/16/17.
 * 513
 * https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null){
                queue.add(root.right);
            }
            if(root.left != null){
                queue.add(root.left);
            }
        }
        return root.val;
    }
}
