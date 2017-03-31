package com.felix.interview.leetcode.medium.array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 1/31/17.
 * 228
 * https://leetcode.com/problems/summary-ranges/
 *
 Given a sorted integer array without duplicates, return the summary of its ranges.

 For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums == null ) return Collections.emptyList();
        List<String> result = new LinkedList<>();
        int start = nums[0], end = nums[0];
        boolean sessionStart = true, sessionEnded = false;
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i]-1 == end){
                //we can continue to the next number
                end = nums[i];
            }else{
                //add the start and end to the list
                result.add(start+"->"+end);
                start = end = nums[i];
            }
        }

        if(nums[nums.length-1]-1 == end){
            result.add(start+"->"+nums[nums.length-1]);
        }else{
            result.add(start+"->"+end);
            result.add(nums[nums.length-1]+"");
        }

        return result;
    }
}
