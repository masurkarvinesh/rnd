package com.vim.rnd.kata.leaderboard;

import com.vim.rnd.common.utils.TestDataUtil;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.stream.Stream;

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
    public void climbingLeaderBoard() throws Exception {

        String scoresIn = TestDataUtil.stringFromFile("fixtures/kata/leaderboard/output1.txt");

        //expected = "6 4 2 1";
//        try {
//            int[] arr = Arrays.stream(expected.split("\r\n"))
//                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
//            System.out.println(Arrays.toString(arr));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //int[] arr = Arrays.stream(str.substring(1, str.length()-1).split(","))
        //        .map(String::trim).mapToInt(Integer::parseInt).toArray();
        //System.out.println(expected);
        //String[] expStr = expected.split("\r\n");

        //Stream powerOfTen = Stream.of(expStr);
       // Integer[] array = powerOfTen.toArray(size -> new Integer[size]);


        //Read more: http://javarevisited.blogspot.com/2017/01/3-ways-to-convert-java-8-stream-to-array.html#ixzz59V4QbRAY


        int[] expectedScore = TestDataUtil.intArrayFromFile("fixtures/kata/leaderboard/output1.txt"); //= new int[] { 6, 4, 2, 1 };
        int[] aliceScore = LeaderBoardClimb.climbingLeaderboard(scores, alice);

        assertThat(aliceScore, Matchers.equalTo(expectedScore));
    }
}