package com.felix.interview.leetcode.hard.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felix on 3/9/17.
 * 51
 * https://leetcode.com/problems/n-queens/?tab=Description
 */
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<String> accum = new ArrayList<>();
        backtrackNQueens(n, 0, result, accum);
        return result;
    }

    private void backtrackNQueens(int n, int count, List<List<String>> result, List<String> accum) {
        if(count == n ){
            if(isLegalConfiguration(accum)) result.add(new ArrayList<>(accum));
        } else {
            for (int i = 0; i < n; i++) {
                accum.add(makeQueenPosition(i, n));
                backtrackNQueens(n, count + 1, result, accum);
                accum.remove(accum.size() - 1);
            }
        }
    }

    private String makeQueenPosition(int p, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n ; i++){
            if(p == i){
                sb.append("Q");
            }else{
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private boolean isLegalConfiguration(List<String> accum) {
        for(int i = 0; i< accum.size(); i++){
            for(int j = i + 1; j < accum.size(); j++){
                //check column overlap
                if(!isQueenOverlapVertically(accum.get(i), accum.get(j)) ||
                        !isQuuenOverlapDiagnally(accum.get(i), accum.get(j))
                        ){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isQueenOverlapVertically(String p, String q){
        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) == q.charAt(i) && p.charAt(i) == 'Q'){
                return false;
            }
        }
        return true;
    }

    private boolean isQuuenOverlapDiagnally(String p, String q){
        for(int i = 1; i < p.length(); i++){
            if(p.charAt(i-1) == q.charAt(i) && q.charAt(i) == 'Q'){
                return false;
            }
        }
        for(int i = 1; i < p.length(); i++){
            if(p.charAt(i) == q.charAt(i-1) && p.charAt(i) == 'Q'){
                return false;
            }
        }
        return true;
    }
}
