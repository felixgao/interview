package com.felix.interview.leetcode.medium.stack;

import com.felix.interview.leetcode.TreeNode;

import java.util.Stack;

/**
 * Created by felix on 3/11/17.
 * 173
 * https://leetcode.com/problems/binary-search-tree-iterator/?tab=Description
 */
public class BSTIterator {
        TreeNode root;
        TreeNode next;
        Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            this.root = root;
            pushAllLeftNodes(this.root);
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode tempNode = stack.isEmpty() ? null : stack.pop();
            if(tempNode == null) return -1;
            else pushAllLeftNodes(tempNode.right);
            return tempNode.val;
        }

        private void pushAllLeftNodes(TreeNode node){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }

}
