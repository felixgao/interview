package com.felix.interview.leetcode.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/5/17.
 * https://leetcode.com/problems/3sum/
 * 15
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> acc = new ArrayList<>();
        Arrays.sort(nums);
        findThreeSum(nums, res, acc, 0);
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            //skip duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1, hi = nums.length-1, target = 0 - nums[i];
                while(lo < hi){
                    if(nums[lo] + nums[hi] == target){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < target){
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }

    private void findThreeSum(int[] nums, List<List<Integer>> res, List<Integer> acc, int i) {
        if(acc.size() == 3){
            int r =acc.stream().reduce(0, (a, b) -> a + b);
            if(r == 0){
                res.add(new ArrayList<>(acc));
            }
            return;
        }
        for(int j = i; j < nums.length; j++){
            acc.add(nums[j]);
            findThreeSum(nums, res, acc, j+1);
            acc.remove(acc.size() - 1);
        }
    }
}
