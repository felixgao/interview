package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 * 75
 * https://leetcode.com/problems/sort-colors/
 *
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length -1;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] == 0 && i > zero){
                int t = nums[zero];
                nums[zero++] = nums[i];
                nums[i] = t;
            }
            while(nums[i] == 2 && i < two){
                int t = nums[two];
                nums[two--] = nums[i];
                nums[i] = t;
            }
        }
    }
}
