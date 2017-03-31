package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;

/**
 * Created by felix on 3/12/17.
 * 235
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/description
 *
 * walk down from the whole tree's root as long as both p and q are in the same subtree
 * (meaning their values are both smaller or both larger than root's).
 * This walks straight from the root to the LCA
 *
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while( (root.val - p.val) * (root.val - q.val) > 0 ){
            root = p.val < root.val ? root.left : root.right;
        }
        return root;
    }

    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q){
        // number if positive if they ended in the same side of root
        // negative or zero if the current node is either the lowest common ancestor
        return (root.val - p.val) * (root.val - q.val) < 1 ?
                root :
                lowestCommonAncestor(
                        p.val < root.val ?
                                root.left :
                                root.right, p, q
                );
    }
}
