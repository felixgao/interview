package com.felix.interview.leetcode.hard.array;

/**
 * Created by felix on 2/11/17.
 * 4
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length-1, n = nums2.length-1;
        //make sure nums1 is the smaller array
        if(m > n) return findMedianSortedArrays(nums2, nums1);
        int minIdx = 0, maxIdx = m, i=0, j=0, num1 =0, num2=0, mid = (m+n+1)/2;
        while(minIdx <= maxIdx){
            i = (minIdx + maxIdx) / 2;
            j = mid - i;
            if ( i < m && j > 0 && nums2[j-1] > nums1[i]) minIdx = i + 1;
            else if (i > 0 && j < n && nums2[j] < nums1[i-1]) maxIdx = i - 1;
            else{
                if (i == 0) num1 = nums2[j-1];
                else if ( j == 0 ) num1 = nums1[i-1];
                else num1 = Math.max(nums1[i-1], nums2[j-1]);
                break;
            }
        }
        if( ((m+n) & 1) == 1 ) return num1;
        if( i == m ) num2 = nums2[j];
        else if ( j == n ) num2 = nums1[i];
        else num2 = Math.min(nums1[i], nums2[j]);
        return (num1+num2)/2.0;
    }
}
