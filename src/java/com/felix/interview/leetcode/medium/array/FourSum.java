package com.felix.interview.leetcode.medium.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/5/17.
 * 18
 * https://leetcode.com/problems/4sum/
 *
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        int len = nums.length;
        if (nums == null || len < 4)
            return res;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        //boundary conditon
        //1. 4 * smallest > target
        //2. 4 * biggest < target
        if(4*nums[0] > target || 4*max < target){
            return res;
        }

        for(int i = 0; i < nums.length; i++){
            if(i==0 || nums[i] != nums[i-1])
                threeSum(nums, res, i+1, target - nums[i], nums[i]);
        }
        return res;
    }

    private void threeSum(int[] nums, List<List<Integer>> res, int startIndex, int target, int current){
        for(int i = startIndex; i < nums.length; i++){
            int lo = i + 1, hi = nums.length - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(target == sum){
                    res.add(Arrays.asList(current, nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                } else if (sum < target){
                    lo ++;
                } else {
                    hi--;
                }
            }
        }
    }
}
