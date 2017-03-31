package com.felix.interview.leetcode.easy.dp;

import java.util.Arrays;

/**
 * Created by felix on 3/4/17.
 * 198
 * https://leetcode.com/problems/house-robber/?tab=Description
 */
public class HouseRobber {
    public int rob(int[] nums) {
        //rob is the total amount if we rub the current hose, notRob is not robbing the current house
        int rob = 0, notRob = 0;
        for(int num : nums){
            //find out the max price if we decide to rob this house
            int curRob = notRob + num;
            //update the notRob to the max of current not rob and rob value
            notRob = Math.max(rob, notRob);
            //update the rob value to current rob value
            rob = curRob;
        }
        return Math.max(rob, notRob);
    }
}
