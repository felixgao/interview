package com.felix.interview.leetcode.easy.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.Test;

/**
 * Created by felix on 3/13/17.
 */
public class SymmetricTreeTest {
    SymmetricTree s = new SymmetricTree();

    private TreeNode symmetricTree1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        return root;
    }

    private TreeNode notSymmetricsTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        return root;
    }

    private TreeNode insymmetricTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(3);
        return root;
    }

    @Test
    public void test1(){
        TreeNode treeNode = symmetricTree1();
        System.out.println(s.isSymmetricIterative(treeNode));
        System.out.println(s.isSysmmetricRecursive(treeNode));
    }

    @Test
    public void test2(){
        TreeNode treeNode = notSymmetricsTree();
        System.out.println(s.isSymmetricIterative(treeNode));
        System.out.println(s.isSysmmetricRecursive(treeNode));
    }

    @Test
    public void test3(){
        TreeNode treeNode = insymmetricTree();
        System.out.println(s.isSymmetricIterative(treeNode));
        System.out.println(s.isSysmmetricRecursive(treeNode));
    }
}
