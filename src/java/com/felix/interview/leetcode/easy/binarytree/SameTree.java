package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/13/17.
 * 100
 * https://leetcode.com/problems/same-tree/#/description
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null) return true;
        if( (p != null && q == null) || (p == null && q != null) ) return false;
        if( p.val != q.val ) return false;
        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
