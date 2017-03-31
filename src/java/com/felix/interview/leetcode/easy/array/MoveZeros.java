package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/27/17.
 * 283
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0, currentIndex = 0;
        while(nums[zeroIndex] != 0){
            zeroIndex++;
        }
        while(currentIndex < nums.length){
            if (zeroIndex < currentIndex && nums[currentIndex] != 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex++] = nums[currentIndex];
                nums[currentIndex] = temp;
            }
            currentIndex++;
        }
    }
    /*
    int j = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }
    }
     */
}
