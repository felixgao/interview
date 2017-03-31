package com.felix.interview.leetcode.easy.array;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by felix on 1/27/17.
 * 414
 */
public class ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(5);
        Set<Integer> seenSet = new HashSet<>();
        for(int n : nums){
            if (!seenSet.contains(n)){
                priorityQueue.offer(n);
                seenSet.add(n);
                if(priorityQueue.size() > 3){
                    seenSet.remove(priorityQueue.poll());
                }
            }
        }
        while(priorityQueue.size() > 1){
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
