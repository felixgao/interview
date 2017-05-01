package com.felix.interview.careercup.sde1;

/**
 * Created by felix on 4/15/17.
 */
public class EditDistance {
    public boolean oneDistanceAway(String s1, String s2){
        if(s1.length() > s2.length()) return oneDistanceAway(s2, s1);
        int s1Len = s1.length(), s2Len = s2.length();
        if(s2Len - s1Len > 1) return false;
        int i1=0, i2=0;
        int diff = 0;
        while( i1 < s1Len && i2 < s2Len ){
            if(s1.charAt(i1) != s2.charAt(i2)){
                diff++;
                if(diff > 1) return false; //short cut
                if(s1Len != s2Len){
                    i1++;
                    continue;
                }
            }
            i1++;
            i2++;
        }
        return true;
    }
}
