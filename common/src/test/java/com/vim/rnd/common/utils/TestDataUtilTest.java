package com.vim.rnd.common.utils;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertThat;

public class TestDataUtilTest {

    @Test
    public void stringFromFile_returnsStringCorrectly() throws Exception {
        StringBuffer expected = new StringBuffer("6").append(TestDataUtil.DATA_DELMITER)
            .append("4").append(TestDataUtil.DATA_DELMITER)
            .append("2").append(TestDataUtil.DATA_DELMITER)
            .append("1");
        String actual = stringFromFile("fixtures/common/utils/testdatautil/intSingleColumnData.txt");

        assertThat(actual, Matchers.equalTo(expected.toString()));
    }

    @Test
    public void intDataFromFile_ReturnsIntArrayCorrectly() throws Exception {
        int[] expected = new int[] { 6, 4, 2, 1 };
        String stringFile = stringFromFile("fixtures/common/utils/testdatautil/intSingleColumnData.txt");
        int[] actual = TestDataUtil.intArrayFromFile(stringFile);

        assertThat(actual, Matchers.equalTo(expected));
    }

    @Test
    public void intRowDataFromFile_ReturnsRowsOfIntArrayCorrectly() throws Exception {
        int[][] expected = new int[][] {
                new int[] {7},
                new int[] {100, 100, 50, 40, 40, 20, 10},
                new int[] {4},
                new int[] {5, 25, 50, 120 }
        };
        String stringFile = stringFromFile("fixtures/common/utils/testdatautil/intRowsOfStringData.txt");
        int[][] actual = TestDataUtil.intArrayOfRowsFromFile(stringFile);

        assertThat(actual, Matchers.equalTo(expected));
    }

    private String stringFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(new ClassPathResource(filename).getFile().toPath()));
    }
}