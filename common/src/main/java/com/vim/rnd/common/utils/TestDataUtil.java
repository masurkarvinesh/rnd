package com.vim.rnd.common.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class TestDataUtil {

    public static String stringFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(new ClassPathResource(filename).getFile().toPath()));
    }

    public static int[] intArrayFromFile (String filename) throws NumberFormatException {
        int[] intArray = null;
        try {
            String intFile = stringFromFile(filename);
            intArray = Arrays.stream(intFile.split("\r\n"))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
            //System.out.println(Arrays.toString(intArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intArray;
    }

    public static int[][] intArrayOfRowsFromFile(String filename) throws NumberFormatException {
        return null;
    }
}
