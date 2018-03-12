package com.vim.rnd.kata.leaderboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardClimb {

    private static List<Integer> uniqueScores;

    static int[] climbingLeaderboard(int[] scores, int[] alicesScore) {
        uniqueScores = collectUniqueScores(scores);
        int[] aliceRanks = aliceClimbsTheLeaderBoard(alicesScore, uniqueScores);
        //printBoard(aliceRanks);
        return aliceRanks;
    }

    private static List<Integer> collectUniqueScores(int[] scores) {
        List<Integer> unique = new ArrayList<>();
        for(int scores_i = 0; scores_i < scores.length; scores_i++){
            pickWhenUniqueScoreFound(scores[scores_i], unique);
        }
        return unique;
    }

    private static void pickWhenUniqueScoreFound(int score, List<Integer> unique) {
        if(unique.size() == 0 || ! unique.contains(score)) {
            unique.add(score);
        }
    }

    private static int[] aliceClimbsTheLeaderBoard(int[] alicesScore, List<Integer> rankList) {
        List<Integer> aliceList = new ArrayList<>();
        for(int alice_i = 0; alice_i < alicesScore.length; alice_i++){
            rankAliceBasedOnEachScore(alicesScore[alice_i], rankList, aliceList);
        }
        return toIntArray(aliceList);
    }

    private static void rankAliceBasedOnEachScore(int alicesRank, List<Integer> rankList, List<Integer> aliceList) {
        rankComparableToTheBoard(alicesRank, rankList, aliceList);
        rankToTheBottomOfTheBoardForLowestScore(rankList, aliceList);
    }

    private static void rankComparableToTheBoard(int alicesRank, List<Integer> rankList, List<Integer> aliceList) {
        for(int rank_i = 0; rank_i < rankList.size(); rank_i++){
            if (isPlacedRank(alicesRank, rankList, aliceList, rank_i)) {
                break; // move to the next score after placing the rank
            }
        }
    }

    private static boolean isPlacedRank(int alicesRank, List<Integer> rankList, List<Integer> aliceList, int rank_i) {
        boolean isPlaced = false;
        if(alicesRank >= rankList.get(rank_i)) {
            aliceList.add(rank_i+1);
            isPlaced = true;
        }
        return isPlaced;
    }

    private static void rankToTheBottomOfTheBoardForLowestScore(List<Integer> rankList, List<Integer> aliceList) {
        if(aliceList.isEmpty()) {
            aliceList.add(rankList.size()+1);
        }
    }

    private static int[] toIntArray(List<Integer> theList) {
        int[] theArray = new int[theList.size()];
        for (int i = 0; i < theList.size(); i++) {
            theArray[i] = theList.get(i);
        }
        return theArray;
    }

    private static void printBoard(int[] ranks) {
        for (int i = 0; i < ranks.length; i++) {
            System.out.print(ranks[i] + (i != ranks.length - 1 ? "\n" : ""));
        }
        System.out.println("\n---------------------------------");
    }
}