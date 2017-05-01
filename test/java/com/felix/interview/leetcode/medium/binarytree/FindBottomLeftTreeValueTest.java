package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;
import org.junit.Test;

/**
 * Created by felix on 3/16/17.
 */
public class FindBottomLeftTreeValueTest {
    FindBottomLeftTreeValue f = new FindBottomLeftTreeValue();

    @Test
    public void test1(){
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(8);
//        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(11);
        node1.left = node2;
        node1.right = node3;
//        node3.left = node4;
        node3.right = node5;
        System.out.println(f.findBottomLeftValue(node1));
    }

    @Test
    public void test2(){
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(8);
        node1.right = node2;
        node2.right = node3;
        System.out.println(f.findBottomLeftValue(node1));
    }
}
