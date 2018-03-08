package com.vim.rnd.kata.leaderboard;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeaderBoardClimbTest {
    private int[] scores;
    private int[] alice;

    @Before
    public void setUp() throws Exception {
        scores = new int[] { 100, 100, 50, 40, 40, 20, 10 };
        alice = new int[] { 5, 25, 50, 120 };
    }

    @Test
    public void climbingLeaderboard() {

        int[] expectedScore = new int[] { 6, 4, 2, 1 };
        int[] aliceScore = LeaderBoardClimb.climbingLeaderboard(scores, alice);

        assertThat(aliceScore, Matchers.equalTo(expectedScore));

        for (int i = 0; i < aliceScore.length; i++) {
            System.out.print(aliceScore[i] + (i != aliceScore.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}