package com.felix.interview.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by felix on 3/6/17.
 * 93
 * https://leetcode.com/problems/restore-ip-addresses/?tab=Description
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int len = s.length();
        for(int i = 1; i<4 && i<len-2; i++){
            for(int j = i+1; j<i+4 && j<len-1; j++){
                for(int k = j+1; k<j+4 && k<len; k++){
                    String s1 = s.substring(0,i), s2 = s.substring(i,j), s3 = s.substring(j,k), s4 = s.substring(k,len);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        res.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return res;
    }
    public boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }


    public List<String> restoreIpAddresses2(String s) {
        List<String> result = new ArrayList<>();
        if(s.length() > 12 || s.length() < 4){
            return result;
        }
        backtrackRestoreIpAddressess(s, 0, s.length(), result, new ArrayList<>());
        return result;
    }

    private void backtrackRestoreIpAddressess(String s, int start, int end, List<String> result, List<String> parts) {
        if(start == end && parts.size() == 4){
            result.add(parts.stream().collect(Collectors.joining(".")));
            return;
        } else  if(parts.size() == 4 && start != end){
            return;
        }
        for(int i = start; i < start + 3 && i < end; i++){
            int val = Integer.valueOf(s.substring(start, i+1));
            if(val >= 0 && val <= 255){
                parts.add(s.substring(start, i+1));
                backtrackRestoreIpAddressess(s, i+1, end, result, parts);
                parts.remove(parts.size()-1);
            }
        }
    }
}
