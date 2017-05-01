package com.felix.interview.techindelight.divideConquer;

/**
 * Created by felix on 4/12/17.
 */
public class Occurance {
    public int findFirstOccurance(int[] array, int n){
        int left = 0, right = array.length;
        while(left < right) {
            int mid = (left + right) >> 1;
            if(array[mid] >= n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return array[left] == n ? left : -1;
    }

    public int findLastOccurance(int[] array, int n){
        int left= 0, right =array.length;
        while(left < right){
            int mid = (left + right) >> 1;
            if(array[mid]<=n){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return array[right-1] == n ? right-1 : -1;
    }
}
