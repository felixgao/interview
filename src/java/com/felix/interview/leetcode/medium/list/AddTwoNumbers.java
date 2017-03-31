package com.felix.interview.leetcode.medium.list;

import com.felix.interview.leetcode.ListNode;

/**
 * Created by felix on 3/26/17.
 */
public class AddTwoNumbers {
    public ListNode add(ListNode node1, ListNode node2){
        int carry = 0;
        if(node1 == null || node2 == null) return node1 == null ? node2 : node1;
        ListNode sentient = new ListNode(0);
        ListNode cur = sentient;

        while(node1 != null || node2 != null){
            int total = carry;
            if(node1 != null){
                total += node1.val;
                node1 = node1.next;
            }
            if(node2 != null){
                total += node2.val;
                node2 = node2.next;
            }
            cur.next = new ListNode(total % 10);
            carry = total / 10;
            cur = cur.next;
        }
        if(carry == 1) cur.next = new ListNode(carry);
        return sentient.next;
    }
}
