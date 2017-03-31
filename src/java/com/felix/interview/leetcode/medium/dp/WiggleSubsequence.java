package com.felix.interview.leetcode.medium.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/4/17.
 * 376
 * https://leetcode.com/problems/wiggle-subsequence/?tab=Description
 */
public class WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        if(nums == null) return 0;
        if(nums.length <2 ) return 1;
        List<Integer> numList = new ArrayList<>(nums.length);
        numList.add(nums[0]);
        //remove duplicates in the beginning
        for(int i =1; i < nums.length; i++){
            if(nums[i] != nums[i-1]) numList.add(nums[i]);
        }
        if(numList.size() < 2) return 1;
        int maxLen = 1, prev = numList.get(0);
        boolean expectBigger = numList.get(1) > numList.get(0);
        for(int i = 1; i < numList.size(); i++){
            if((expectBigger && numList.get(i) > prev) || (!expectBigger && numList.get(i) < prev)){
                maxLen++;
                expectBigger = !expectBigger;
            }
            prev = numList.get(i);
        }
        return maxLen;
    }
}
