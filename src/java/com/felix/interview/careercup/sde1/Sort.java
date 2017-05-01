package com.felix.interview.careercup.sde1;

import java.util.Arrays;

/**
 * Created by felix on 4/15/17.
 */
public class Sort {
    /***
     * Given an unsorted array, sort it in such a way that the first
     element is the largest value, the second element is the smallest,
     the third element is the second largest element and so on.
     [2, 4, 3, 5, 1] -> [1, 2, 3, 4, 5] ->
     [1, 2, 5, 4, 3] -> [1, 2, 4, 5, 3] -> [5, 2, 4, 1, 3]


     [5, 1, 4, 2, 3]
     can you do it without using extra space
     */
    public void sortAlternate(int[] nums){
        Arrays.sort(nums);
    }
}
