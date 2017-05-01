package com.felix.interview.leetcode.medium.bitmanipulation;

import java.util.HashSet;
import java.util.Set;

/**
 * 421
 https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/#/description

 Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.

 Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.

 Could you do this in O(n) runtime?

 Example:

 Input: [3, 10, 5, 25, 2, 8]

 Output: 28

 Explanation: The maximum result is 5 ^ 25 = 28.
 *
 */
public class MaximumXOROfTwoNumbers {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for(int i = 31; i >=0; i--){
            mask |= (1 << i);
            Set<Integer> andMaskedSet = new HashSet<>();
            for(int num : nums){
                andMaskedSet.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : andMaskedSet){
                if(andMaskedSet.contains(tmp ^ prefix)){
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}
