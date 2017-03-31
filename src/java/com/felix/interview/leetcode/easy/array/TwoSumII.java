package com.felix.interview.leetcode.easy.array;

/**
 * Created by felix on 1/29/17.
 * 167
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] solution = new int[2];
        //need to check if numbers are null and contains more than two elements
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                solution[0] = left + 1;
                solution[1] = right + 1;
                break;
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return solution;
    }
}
