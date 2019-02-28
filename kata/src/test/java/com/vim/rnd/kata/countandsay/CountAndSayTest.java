package com.vim.rnd.kata.countandsay;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {

//    @Test
//    public void testCountAndSayForOneTerm() {
//        assertThat(CountAndSay.countAndSayForATerm(1), Matchers.equalTo(11));
//        assertThat(CountAndSay.countAndSayForATerm(11), Matchers.equalTo(21));
//        assertThat(CountAndSay.countAndSayForATerm(21), Matchers.equalTo(1211));
//        assertThat(CountAndSay.countAndSayForATerm(1211), Matchers.equalTo(111221));
//        assertThat(CountAndSay.countAndSayForATerm(111221), Matchers.equalTo(312211));
//        assertThat(CountAndSay.countAndSayForATerm(312211), Matchers.equalTo(13112221));
//        assertThat(CountAndSay.countAndSayForATerm(13112221), Matchers.equalTo(1113213211));
//    }

    @Test
    public void testCountAndSayForNthTerm() {
        int [] testData = new int[] { 11, 21, 1211, 111221, 312211, 13112221, 1113213211 };
        double cc = 1, cas;
        for(int i = 0; i<testData.length; i++) {
            cas = CountAndSay.countAndSay(cc);
            System.out.println(cc + " : " + cas);
            assertThat(cas, Matchers.equalTo(testData[i]));
            cc = cas;
        }
    }

//    @Test
//    public void nthTerm1_returns11() {
//        int [] cas = new int[]{ 1 };
//        assertThat(CountAndSay.countAndSayForATerm(1), Matchers.equalTo(cas));
//    }
//
//    @Test
//    public void nthTerm2_returns11() {
//        int [] cas = new int[]{ 1, 11 };
//        assertThat(CountAndSay.countAndSayForATerm(2), Matchers.equalTo(cas));
//    }
//
//    @Test
//    public void nthTerm3_returns21() {
//        int [] cas = new int[]{ 1, 11, 21 };
//        assertThat(CountAndSay.countAndSayForATerm(3), Matchers.equalTo(cas));
//    }
//
//    @Test
//    public void nthTerm4_returns1211() {
//        int [] cas = new int[]{ 1, 11, 21, 1211 };
//        assertThat(CountAndSay.countAndSayForATerm(4), Matchers.equalTo(cas));
//    }
//
//    @Test
//    public void nthTerm5_returns111221() {
//        int [] cas = new int[]{ 1, 11, 21, 1211, 111221 };
//        assertThat(CountAndSay.countAndSayForATerm(5), Matchers.equalTo(cas));
//    }
}