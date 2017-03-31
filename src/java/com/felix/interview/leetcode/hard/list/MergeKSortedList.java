package com.felix.interview.leetcode.hard.list;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by felix on 2/12/17.
 * 23
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedList {
    public static final class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.val));
        for(ListNode node : lists){
            if (node != null){
                queue.offer(node);
            }
        }
        if ( queue.isEmpty() ){
            return null;
        }
        ListNode head = queue.poll(), current = head;
        if(head.next != null) queue.offer(head.next);
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            if(node.next != null){
                queue.offer(node.next);
            }
            current.next = node;
            current = current.next;
        }
        return head;
    }
}
