package com.felix.interview.leetcode.medium.stack;

import apple.laf.JRSUIUtils;
import com.felix.interview.leetcode.TreeNode;
import com.felix.interview.leetcode.medium.dp.Triangle;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by felix on 3/11/17.
 * 144
 * https://leetcode.com/problems/binary-tree-preorder-traversal/?tab=Description
 */
public class BinaryTreeTraversal {
    //recursive solution is trivial, iterative solution
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null){
            result.add(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            cur = cur.left;
            if(cur == null && !stack.isEmpty()){
                cur = stack.pop();
            }
        }
        return result;
    }

    private void PushLeftChildren(Stack<TreeNode> stack, TreeNode cur) {
        while(cur != null){
            stack.push(cur);
            cur = cur.left;
        }
    }
}
