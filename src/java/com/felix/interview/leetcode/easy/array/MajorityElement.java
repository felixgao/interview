package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums[0], count=1;
        for(int i =1; i< nums.length; i++){
            // When count reaches zero we are going to assign the current number as the new majority
            if(count == 0){
                count ++;
                majority = nums[i];
            //if the number is the same as majority, increment the count by 1
            } else if (majority == nums[i]){
                count ++;
            } else {
                // the number is not majority and we have a majority at the moment,
                //decrement the value so we can have a new majority if we reach 0 count
                count --;
            }
        }
        return majority;
    }
}
