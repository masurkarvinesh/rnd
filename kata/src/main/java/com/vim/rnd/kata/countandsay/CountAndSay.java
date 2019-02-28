package com.vim.rnd.kata.countandsay;

import java.util.Arrays;

public class CountAndSay {

    //data.split(  "0+|(?<=([1-9]))(?=[1-9])(?!\\1)");
    private static final String regexParseByTerm = "0+|(?<=([1-9]))(?=[1-9])(?!\\1)";
    private static final String regexParseForUniqueDigit = "(?<=.)";

    static double countAndSay(double nth) {
        double [] cas = new double[new Double(nth).intValue()];
        double term = 1;
        for(int i=0; i<nth; i++) {
            term = countAndSayForATerm(term);
            cas[i] = term;
        }
        return cas[cas.length-1];
    }

    static double countAndSayForATerm(double number) {
        String count_say = "";
        String[] casArray = split(number);
        for (String cas: casArray) {
            double num = Double.valueOf(cas);
            count_say += count(num) + say(num);
        }
        return Double.valueOf(count_say);
    }

    private static String[] split(double num) {
        return String.valueOf(num).split(regexParseByTerm);
    }

    private static int count(double num) {
        return (int) (Math.log10(num) + 1);
        //return (int) (Math.log10(num));
    }

    private static String say(double num) {
        return String.valueOf(num).split(regexParseForUniqueDigit)[0];
    }

//    private static void parseInput() {
//        String[] tests = {"11101100112021120", "222222222", "222222122",
//                "000000000", "0000100000", "11121222212112133321"};
//        for (String data : tests) {
//            System.out.println(data + " ->" + Arrays.toString(data.split(regex)));
//            System.out.println("-----------------------");
//        }
//    }
}