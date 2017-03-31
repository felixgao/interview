package com.felix.interview.leetcode.medium.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by felix on 3/5/17.
 * 464
 * https://leetcode.com/problems/can-i-win/?tab=Description
 * Assume I am starting player
 */
public class CanIWin {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal <= maxChoosableInteger || desiredTotal <= 0) return true;
        //when desiered total is bigger than twice the max choosable integer, there is no way to win
        //eg. desiredTotal = 21, maxChooseableInteger = 5
        //p1(5, 16), p2(1, 15), p1(5,10), p2(1, 9), p1(1, 8), p2(2, 6), p1(3, 3), p2(3, 0) p1 wins
        //whoever, when desiredTotal = 10, maxChooseableInteger = 4
        //p1(4, 6), p2(1, 5), p1(4, 1), p2(1,0) p2 wins
        if (maxChoosableInteger*(maxChoosableInteger+1)/2 < desiredTotal) return false;

        return canIWin(desiredTotal, new int[maxChoosableInteger], new HashMap<>());

    }

    private boolean canIWin(int desiredTotal, int[] states, HashMap<String, Boolean> map) {
        String curr= Arrays.toString(states);
        if(map.containsKey(curr)) return map.get(curr);
        for(int i = 0; i < states.length; i++){
            if(states[i] == 0){
                states[i] = 1;
                //+1 becuase our choosable integer is 1 .. n where n is hte length of the states array
                if(desiredTotal <= i + 1 ||
                        !canIWin(desiredTotal - (i + 1), states, map)
                        ){
                    map.put(curr, true);
                    states[i] = 0;
                    return true;
                }
            }
            //reset states
            states[i] = 0;
        }
        map.put(curr, false);
        return false;
    }
}
