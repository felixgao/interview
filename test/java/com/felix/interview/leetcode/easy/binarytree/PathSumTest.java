package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * Created by felix on 3/12/17.
 */
public class PathSumTest {
    PathSum p = new PathSum();
    private TreeNode setup(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left =  new TreeNode(7);
        root.left.left.right =  new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        return root;
    }

    @Test
    public void test(){
        TreeNode node = setup();
        System.out.println(p.hasPathSum(node, 22));
        System.out.println(p.hasPathSum(node, 2));
        System.out.println(p.hasPathSum(node, 122));
    }
}
