package com.felix.interview.leetcode.easy.array;

import com.felix.interview.leetcode.easy.array.RemoveElements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by felix on 1/29/17.
 */
public class RemoveElementsTest {

    @Test
    public void test(){
        RemoveElements r = new RemoveElements();
        int[] array = new int[] {3,2,2,3};
        System.out.println(r.removeElement(array, 3));
        System.out.println(Arrays.toString(array));
    }
}
