package com.vim.rnd.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TestDataUtil {

    public static String DATA_DELMITER = "\r\n";

    public static int[] intArrayFromFile (String stringFile) throws Exception {
        //String intFile = stringFromFile(filename);
        return getIntArrayFromString(stringFile, DATA_DELMITER);
    }

    public static int[][] intArrayOfRowsFromFile(String stringFile) throws Exception {
        String[] intFile = StringUtils.split(stringFile, "\n");
        int[][] intArrayOfRows = new int[intFile.length][intFile.length];
        for(int i = 0; i < intFile.length; i++) {
            int[] temp = getIntArrayFromString(intFile[i], " ");
            intArrayOfRows[i] = temp;
        }
        return intArrayOfRows;
    }

    private static int[] getIntArrayFromString(String intFile, String separator) {
        int[] intArray = null;
        try {
            intArray = Arrays
                    .stream(intFile
                            .split(separator))
                    .map(String::trim)
                    .mapToInt(Integer::parseInt).toArray();
            //System.out.println(Arrays.toString(intArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return intArray;
    }
}