package com.felix.interview.leetcode.medium.hashtable;

import org.junit.Test;

/**
 * Created by felix on 2/12/17.
 */
public class GroupShiftedStringTest {
    GroupShiftedString g = new GroupShiftedString();

    @Test
    public void test1(){
        System.out.println(g.groupStrings(new String[] {"abc","bcd","xyz", "az","ba", "acef", "a","z"}));
    }
}
