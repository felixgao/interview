package com.felix.interview.leetcode.hard.binarysearch;

/**
 * Created by felix on 2/20/17.
 * 410
 * https://leetcode.com/problems/split-array-largest-sum/?tab=Description
 *
 */
public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int max = 0; long sum = 0;
        for(int num : nums){
            max = Math.max(num, max);
            sum += num;
        }
        if(m == 1) return (int) sum;
        long l = max, r = sum;
        while(l <= r){
            long mid = (l+r)/2;
            if(valid(mid, nums, m)){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) l;
    }

    private boolean valid(long target, int[] nums, int m) {
        int count = 1;
        long total = 0;
        for(int num : nums){
            total += num;
            if(total > target){
                total = num;
                count++;
            }
            if(count > m){
                return false;
            }
        }
        return true;
    }
}
