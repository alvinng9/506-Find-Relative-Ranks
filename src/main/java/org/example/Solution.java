package org.example;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        //create a priority queue to sort integers in the array
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        String[] result = new String[score.length];
        //add integers to the priority queue
        for (int here : score) {
            pq.offer(here);
        }
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //map the position to the index
        while(!pq.isEmpty()) {
            map.put(pq.remove(), index++);
        }
        //add the position to the String array
        for (int i = 0; i < score.length; i++) {
            int temp = map.get(score[i]);
            if (temp == 0) {
                result[i] = "Gold Medal";
            } else if (temp == 1) {
                result[i] = "Silver Medal";
            } else if (temp == 2) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(temp + 1);
            }
        }
        return result;
    }
}
