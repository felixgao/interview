package com.felix.interview.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by felix on 1/27/17.
 * 219
 */
public class ContainsDuplicateII {
    public  boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            //mantains a window of size k, remove any elements that is outside of the window as we iterate the array.
            if(i > k) set.remove(nums[i-k-1]);
            //set add returns false when element already exists in set
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
