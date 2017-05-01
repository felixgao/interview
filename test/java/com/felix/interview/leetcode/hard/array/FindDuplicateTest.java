package com.felix.interview.leetcode.hard.array;

import com.felix.interview.leetcode.hard.array.FindDuplicate;
import org.junit.Test;

/**
 * Created by felix on 1/24/17.
 */
public class FindDuplicateTest {

    @Test
    public void test1(){
        int[] test = new int[] {1,4,2,3,4};
        FindDuplicate findDuplicate = new FindDuplicate();
        System.out.println(findDuplicate.findDuplicate(test));
    }
}
