package com.felix.interview.leetcode.medium.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 1/29/17.
 * 442
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        //Since the each element in the array is within 1 < n < nums.length
        //once we encounter an element, we flip the position of the i=(element -1) to negative
        //if we encounter the value as negative then the number as duplicates

        List<Integer> result = new LinkedList<>();
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) -1;
            if(nums[index] < 0){
                result.add(Math.abs(nums[i]));
            }else{
                nums[index] *= -1;
            }
        }
        return result;
    }
}
