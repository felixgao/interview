package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 1/30/17.
 * 229
 * https://leetcode.com/problems/majority-element-ii/
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 */
public class MajorityElementsII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1=nums[0], candidate2=nums[0], count1=0, count2=0;
        for(int n : nums){
            if(candidate1 == n){
                count1++;
            } else if (candidate2 == n){
                count2++;
            } else if (count1 == 0){
                candidate1 = n;
                count1++;
            } else if (count2 == 0){
                candidate2 = n;
                count2++;
            } else{
                count1--;
                count2--;
            }
        }

        count1 =0; count2=0;
        for(int n : nums){
            if(candidate1 == n){
                count1++;
            }
            if(candidate2 == n){
                count2++;
            }
        }
        if(count1 > nums.length/3) result.add(candidate1);
        if(count2 > nums.length/3) result.add(candidate2);

        return result;
    }
}
