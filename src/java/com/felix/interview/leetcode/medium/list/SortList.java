package com.felix.interview.leetcode.medium.list;

/**
 * Created by felix on 2/12/17.
 * 148
 * https://leetcode.com/problems/sort-list/
 */
public class SortList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head, previous = head;
        //find the middle of the partition
        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //cut the list into two
        previous.next = null;
        //slow is now the head of the the fast list.
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);

        return mergeList(list1, list2);
    }

    private ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode tHead = null;
        if ( list1 == list2 ){
            return list1;
        }
        if ( list1 == null ){
            return list2;
        } else if( list2 == null ) {
            return list1;
        }
        //prime the head pointer
        if ( list1.val < list2.val ) {
            tHead = list1;
            list1 = list1.next;
        }else{
            tHead = list2;
            list2 = list2.next;
        }
        ListNode current = tHead;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                current = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
        }
        //check if we have exhaused both lists
        if(list1 != null){
            current.next = list1;
        }
        if(list2 != null){
            current.next = list2;
        }
        return tHead;
    }

}
