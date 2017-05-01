package com.felix.interview.techindelight.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by felix on 4/12/17.
 */
public class LeftView {
    public List<TreeNode> leftView(TreeNode root){
        if(root == null) return null;
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode node = queue.poll();
            list.add(node);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            for(int i = 1; i < size; i++){
                node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return list;
    }
}
