package com.felix.interview.leetcode.medium.list;

import org.junit.Test;

/**
 * Created by felix on 2/12/17.
 */
public class SortListTest {
    SortList s = new SortList();

    @Test
    public void test1(){
        SortList.ListNode l1 = new SortList.ListNode(5);
        SortList.ListNode l2 = new SortList.ListNode(4);
        SortList.ListNode l3 = new SortList.ListNode(3);
        l1.next = l2; l2.next = l3;
        SortList.ListNode sort = s.sortList(l1);
        while(sort != null){
            System.out.println(sort.val);
            sort = sort.next;
        }
    }
}
