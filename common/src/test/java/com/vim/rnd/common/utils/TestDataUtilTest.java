package com.vim.rnd.common.utils;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TestDataUtilTest {

    @Test
    public void stringFromFile_returnsStringCorrectly() throws Exception {
        String expected = "6\r\n4\r\n2\r\n1";
        String actual = TestDataUtil.stringFromFile("fixtures/common/utils/testdatautil/intSingleColumnData.txt");

        assertThat(actual, Matchers.equalTo(expected));
    }

    @Test
    public void intDataFromFile_ReturnsIntArrayCorrecty() {
        int[] expected = new int[] { 6, 4, 2, 1 };
        int[] actual = TestDataUtil.intArrayFromFile("fixtures/common/utils/testdatautil/intSingleColumnData.txt");

        assertThat(actual, Matchers.equalTo(expected));
    }

    @Test
    public void intRowDataFromFile_ReturnsRowsOfIntArrayCorrecty() {
        int[][] expected = new int[][] {
                new int[] {7},
                new int[] {100, 100, 50, 40, 40, 20, 10},
                new int[] {4},
                new int[] {5, 25, 50, 120}
        };
        int[][] actual = TestDataUtil.intArrayOfRowsFromFile("fixtures/common/utils/testdatautil/intRowsOfStringData.txt");

        assertThat(actual, Matchers.equalTo(expected));
    }
}