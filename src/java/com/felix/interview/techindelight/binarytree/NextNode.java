package com.felix.interview.techindelight.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by felix on 4/10/17.
 */
public class NextNode {
    public TreeNode nextNode(TreeNode root, TreeNode node){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return null;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode cur = queue.poll();
                if(cur == node){
                    return queue.peek();
                }
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }
        }
        return null;
    }
}
