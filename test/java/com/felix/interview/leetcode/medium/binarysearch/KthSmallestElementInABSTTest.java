package com.felix.interview.leetcode.medium.binarysearch;

import com.felix.interview.leetcode.TreeNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by felix on 2/25/17.
 */
public class KthSmallestElementInABSTTest {
    KthSmallestElementInABST k = new KthSmallestElementInABST();
    static TreeNode root = new TreeNode(5);

    @BeforeClass
    static void setup(){
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        TreeNode node = root.left;
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node = root.right;
        node.left = new TreeNode(7);
        node.right = new TreeNode(9);
    }

    @Test
    public void test1(){
        System.out.println(k.kthSmallest(root, 3));
//        System.out.println(k.kthSmallestInOrder(root, 3));
    }
}
