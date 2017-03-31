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
