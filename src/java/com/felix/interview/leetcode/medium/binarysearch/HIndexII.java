package com.felix.interview.leetcode.medium.binarysearch;

/**
 * Created by felix on 2/24/17.
 * 275
 * https://leetcode.com/problems/h-index-ii/?tab=Description
 */
public class HIndexII {
    public int hIndex(int[] citations) {
        int left = 0, right = citations.length, len = citations.length;
        while(left <= right){
            int mid = (left + right) / 2;
            if(citations[mid] >= len - mid){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return len-left;
    }
}
