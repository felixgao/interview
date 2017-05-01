package com.felix.interview.techindelight.array;

import java.util.Arrays;

/**
 * Created by felix on 4/8/17.
 */
public class LongestIncreaseSubsequence {

    public int findLIS(int[] array){
        int[] LIS = new int[array.length];
        int len = 0;
        for(int i = 0; i < array.length; i++){
            int pos = Arrays.binarySearch(LIS, 0, len, array[i]);
            if(pos < 0) pos = -(pos+1);
            LIS[pos] = array[i];
            if(pos == len) len++;
        }
        return len;
    }
}
