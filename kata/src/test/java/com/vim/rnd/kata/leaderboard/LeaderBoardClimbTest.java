package com.vim.rnd.kata.leaderboard;

import com.vim.rnd.common.utils.TestDataUtil;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.*;

public class LeaderBoardClimbTest {

    @Test
    public void climbingLeaderBoard_returnsCorrectRanks() throws Exception {
        String outputFile = stringFromFile("fixtures/kata/leaderboard/output2.txt");
        int[] expectedRanks = TestDataUtil.intArrayFromFile(outputFile);
        String inputFile = stringFromFile("fixtures/kata/leaderboard/input2.txt");
        int[][] intArrayOfRows = TestDataUtil.intArrayOfRowsFromFile(inputFile);

        int[] actualRanks = LeaderBoardClimb.climbingLeaderboard(intArrayOfRows[1], intArrayOfRows[3]);

        assertThat(actualRanks, Matchers.equalTo(expectedRanks));
    }

     private String stringFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(new ClassPathResource(filename).getFile().toPath()));
    }
}