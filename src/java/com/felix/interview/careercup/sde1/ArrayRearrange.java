package com.felix.interview.careercup.sde1;

/**
 * Created by felix on 4/15/17.
 */
public class ArrayRearrange {
    public void rearrange(int[] array){
        int zero = 0;
        for(int i =0; i< array.length; i++){
            if(array[i] != 0){
                array[zero++] = array[i];
            }
        }
        while(zero < array.length){
            array[zero++] = 0;
        }
    }
}
