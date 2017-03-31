package com.felix.interview.leetcode.medium.binarysearch;


import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 2/25/17.
 * 230
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/?tab=Description
 */
public class KthSmallestElementInABST {
    private static class Counter {
        int count;
        int value;
        public Counter(int count){
            this.count = count;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        int count = nodeCount(root.left);
        if(k <= count){
            return kthSmallest(root.left, k);
        }else if(k > count + 1){
            return kthSmallest(root.right, k - 1 - count);
        }
        return root.val;
    }

    private int nodeCount(TreeNode node){
        if(node == null) return 0;
        return 1 + nodeCount(node.left) + nodeCount(node.right);
    }


    public int kthSmallestInOrder(TreeNode root, int k){
        Counter c = new Counter(k);
        inOrder(root, c);
        return c.value;
    }
    private void inOrder(TreeNode node, Counter c){
        if(node.left != null) inOrder(node.left, c);
        c.count--;
        if(c.count == 0){
            c.value = node.val;
            return;
        }
        if (node.right != null) inOrder(node.right, c);
    }
}
