package com.felix.interview.leetcode.medium.list;

import com.felix.interview.leetcode.ListNode;

/**
 *
 Given a non-negative number represented as a singly linked list of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.

 Example:
 Input:
 1->2->3

 Output:
 1->2->4

 */
public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        if(head == null){
            return null;
        }
        int ret = plusOneRecursive(head);
        if(ret == 1){
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }else{
            return head;
        }
    }

    private int plusOneRecursive(ListNode node){
        if(node == null){
            return 1;
        }
        int carry = plusOneRecursive(node.next);
        int total = carry + node.val;
        node.val = total % 10;
        return total / 10;
    }
}
