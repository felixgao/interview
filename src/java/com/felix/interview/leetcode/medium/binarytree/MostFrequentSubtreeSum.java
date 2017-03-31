package com.felix.interview.leetcode.medium.binarytree;

import com.felix.interview.leetcode.TreeNode;

import java.util.*;

/**
 * Created by felix on 3/18/17.
 * 508
 * https://leetcode.com/problems/most-frequent-subtree-sum/#/description
 */
public class MostFrequentSubtreeSum {
    //Frequency, ListOfInts that sums up to that
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> sumFreq = new HashMap<>();
        findTreeSum(root, sumFreq);
        Comparator<? super Map.Entry<Integer, Integer>> maxValueComparator = Comparator.comparing(Map.Entry::getValue);
        Map.Entry max = sumFreq.entrySet().stream().max(maxValueComparator).get();
        int[] res  = sumFreq.entrySet().stream()
                .filter(entry -> entry.getValue() == max.getValue())
                .mapToInt(entry -> entry.getKey())
                .toArray();
        return res;
    }

    private int findTreeSum(TreeNode node, Map<Integer, Integer> sumFreq){
        if(node == null) return 0;
        int sum = node.val + findTreeSum(node.left, sumFreq) + findTreeSum(node.right, sumFreq);
        sumFreq.compute(sum, (k,v) -> v == null ? 1 : v + 1);
        return sum;
    }

}
