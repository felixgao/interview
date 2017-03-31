package com.felix.interview.leetcode.medium.array;

/**
 * Created by felix on 2/2/17.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 80
 *
 * because it is sorted array we can also do the following
  public int removeDuplicates(int[] nums) {
 int i = 0;
 for (int n : nums)
 if (i < 2 || n > nums[i-2])
 nums[i++] = n;
 return i;
 }

 *
 *
 */
public class RemoveDuplicateFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 1, r = 1;
        int count = 1;
        for(int i =1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                if(k != 0){
                    k--;
                    nums[r++] = nums[i];
                    count++;
                }
            }else{
                k = 1;
                nums[r++] = nums[i];
                count++;
            }
        }
        return count;
    }
}
