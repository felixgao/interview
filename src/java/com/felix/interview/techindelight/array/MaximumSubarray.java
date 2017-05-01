package com.felix.interview.techindelight.array;

/**
 * Created by felix on 4/8/17.
 *  {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 */
public class MaximumSubarray {
    public int kadane(int[] array){
        long max = 0, maxSoFar = 0;
        for(int num : array){
            if(maxSoFar+num < num){
                maxSoFar = num;
            }else{
                maxSoFar+= num;
            }
            max = Math.max(max, maxSoFar);
        }
        return (int)max;
    }
}
