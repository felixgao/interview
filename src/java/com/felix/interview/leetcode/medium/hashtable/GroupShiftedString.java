package com.felix.interview.leetcode.medium.hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by felix on 2/12/17.
 * http://www.programcreek.com/2014/05/leetcode-group-shifted-strings-java/
 */
public class GroupShiftedString {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strings){
            char[] chars = s.toCharArray();
            int diff = chars[0] - 'a';
            for(int i = 0; i < chars.length; i++){
                if(chars[i]-diff < 'a') //we have a shift
                    chars[i] = (char)(chars[i] - diff + 26);
                else
                    chars[i] = (char)(chars[i] - diff);
            }
            String t = new String(chars);
            map.compute(t, (k,v) ->{
               if(v == null){
                   List<String> l = new LinkedList<>();
                   l.add(s);
                   return l;
               } else {
                   v.add(s);
                   return v;
               }
            });
        }
        List<List<String>> result = new LinkedList<>();
        result.addAll(map.values());
        return result;
    }
}
