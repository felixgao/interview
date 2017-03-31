package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by felix on 3/13/17.
 * 101
 * https://leetcode.com/problems/symmetric-tree/#/description
 */
public class SymmetricTree {
    public boolean isSymmetricIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return true;
        if(!process(root.left, root.right, stack)) return false;
        while(!stack.isEmpty()){
            if(stack.size() % 2 != 0) return false;
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if(left.val != right.val) return false;
            if(!process(left.left, right.right, stack)) return false;
            if(!process(right.left, left.right, stack)) return false;
        }
        return true;
    }

    boolean process(TreeNode a, TreeNode b, Stack<TreeNode> s) {
        if(a != null) {
            if(b == null) return false;
            s.push(a);
            s.push(b);
        }else if(b != null) return false;
        return true;
    }

    public boolean isSysmmetricRecursive(TreeNode root){
        return root == null || isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        } else if ( (left == null && right != null) ||
                    (left != null && right == null)
                ){
            return false;
        }

        return left.val == right.val &&
                isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left)
                ;
    }
}
