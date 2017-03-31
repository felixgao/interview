package com.felix.interview.leetcode.hard.dp;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by felix on 2/26/17.
 * 403
 * https://leetcode.com/problems/frog-jump/?tab=Description
 *
 */
public class FrogJump {
    public boolean canCross(int[] stones) {
        if (stones.length == 0) {
            return true;
        }
        //map key is the stone's position, map value is the steps can be taken from that stone
        Map<Integer, Set<Integer>> map = new LinkedHashMap<>();
        for (int stone : stones){
            map.put(stone, new HashSet<>());
        }
        map.get(0).add(1);
        int lastStone = stones[stones.length-1];

        for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()){
            int stone = entry.getKey();
            Set<Integer> steps = entry.getValue();
            for (int step : steps) {
                int reach = step + stone;
                if (reach == lastStone) return true;
                if (map.containsKey(reach)){
                    Set<Integer> nextStep = map.get(reach);
                    nextStep.add(step);
                    nextStep.add(step + 1);
                    if (step - 1 > 0) nextStep.add(step - 1);
                }
            }
        }
        return false;
    }
}
