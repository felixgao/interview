package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by felix on 3/16/17.
 * 173
 * https://leetcode.com/problems/binary-search-tree-iterator/#/description
 */
public class BinarySearchTreeIterator {
    TreeNode root;
    Stack<TreeNode> stack = new Stack<>();

    public BinarySearchTreeIterator(TreeNode root) {
        this.root = root;
        pushAllNodesOnStack(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode top = stack.pop();
        if(top == null) return -1; //This should be impossible
        else pushAllNodesOnStack(top.right);
        return top.val;
    }

    private void pushAllNodesOnStack(TreeNode curr){
        while(curr != null){
            stack.push(curr);
            curr = curr.left;
        }
    }
}
