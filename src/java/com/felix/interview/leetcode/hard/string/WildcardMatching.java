package com.felix.interview.leetcode.hard.string;

/**
 * Created by felix on 2/19/17.
 * 44
 * https://leetcode.com/problems/wildcard-matching/?tab=Description
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int u = 0, v = 0, match = 0, starIndex = -1;
        while(u < s.length()){
            if( v < p.length()  && (s.charAt(u) == p.charAt(v) || p.charAt(v) == '?') ){
                u++;
                v++;
            } else if (v < p.length() && p.charAt(v) == '*') { //* can map to anything, try greedy match
                starIndex = v;
                match = u; //save where we started the matching
                v++;
            } else if (starIndex != -1){ //we have a star match and we don't any any previous match
                v = starIndex+1; //advance pattern pointer
                match++; //advanced string pointer
                u = match;
            } else { //no match
                return false;
            }
        }
        //if we haven't exhuased pattern, the only allowed pattern is * for empty string
        while( v < p.length() && p.charAt(v) == '*'){
            v++;
        }
        return v == p.length();
    }
}
