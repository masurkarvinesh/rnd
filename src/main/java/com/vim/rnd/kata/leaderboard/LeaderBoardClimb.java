package com.vim.rnd.kata.leaderboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardClimb {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> rankList = new ArrayList<>();
        for(int scores_i = 0; scores_i < scores.length; scores_i++){
            if(rankList.size() == 0 || ! rankList.contains(scores[scores_i])) {
                rankList.add(scores[scores_i]);
            }
        }

        int[] aliceRanks = new int[alice.length];
        for(int alice_i = 0; alice_i < alice.length; alice_i++){
            for(int rank_i = 0; rank_i < rankList.size(); rank_i++){
                int r = rankList.get(rank_i);
                if(alice[alice_i] >= r) {
                    aliceRanks[alice_i] = r;
                }
            }
            if(aliceRanks.length == 0) {
                aliceRanks[0] = rankList.size()+1;
            }
        }
        return aliceRanks;
    }
}