package com.felix.interview.leetcode.medium.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 2/11/17.
 * 325
 * https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/
 *
 Example 1:

 Given nums = [1, -1, 5, -2, 3], k = 3,
 return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

 Example 2:

 Given nums = [-2, -1, 2, 1], k = 1,
 return 2. (because the subarray [-1, 2] sums to 1 and is the longest)
 *
 *
 * The HashMap stores the sum of all elements before index i as key, and i as value.
 * For each i, check not only the current sum but also (currentSum - previousSum) to see if there is any that equals k,
 * and update max length.
 */
public class MaximalSubArraySumEqualsToK {
    public int arraySum(int[] array, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            if( sum == k ) max = i + 1;/* i+1 must be longest by now, so no need to max() */
            else max = Math.max(max, i - map.getOrDefault(sum - k, i));/* [0,j]=sum-k, (j,i]=k */
            map.putIfAbsent(sum, i);
        }
        return max;
    }
}
