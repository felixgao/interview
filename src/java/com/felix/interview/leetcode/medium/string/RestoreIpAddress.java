package com.felix.interview.leetcode.medium.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by felix on 2/19/17.
 * 93
 * https://leetcode.com/problems/restore-ip-addresses/?tab=Description
 */
public class RestoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        for(int i = 1; i< 4 && i < s.length() - 2; i++){
            for(int j = i+1; j < i+4 && j < s.length()-1; j++){
                for(int k = j+1; k < j+4 && k < s.length(); k++){
                    String p1 = s.substring(0, i),
                            p2 = s.substring(i, j),
                            p3 = s.substring(j, k),
                            p4 = s.substring(k, s.length());
                    if(isValid(p1) &&
                            isValid(p2) &&
                            isValid(p3) &&
                            isValid(p4)){
                        result.add(p1+"."+p2+"."+p3+"."+p4);
                    }
                }
            }
        }
        return result;
    }

    private boolean isValid(String part) {
        if(part.length() > 3 || part.length() == 0 ||//invalid size of part
                (part.charAt(0) == '0' && part.length() > 1) || //invalid ip if part have more than 1 char and starts with 0
                Integer.valueOf(part) > 255
                ){
            return false;
        }
        return true;
    }


}
