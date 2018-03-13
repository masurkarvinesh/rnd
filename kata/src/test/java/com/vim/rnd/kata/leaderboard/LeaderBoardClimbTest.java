package com.vim.rnd.kata.leaderboard;

import com.vim.rnd.common.utils.TestDataUtil;
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
    public void climbingLeaderBoard_returnsCorrectRanks() throws Exception {
        int[] expectedRanks = TestDataUtil.intArrayFromFile("fixtures/kata/leaderboard/output1.txt"); //= new int[] { 6, 4, 2, 1 };
        int[] actualRanks = LeaderBoardClimb.climbingLeaderboard(scores, alice);

        assertThat(actualRanks, Matchers.equalTo(expectedRanks));
    }
}