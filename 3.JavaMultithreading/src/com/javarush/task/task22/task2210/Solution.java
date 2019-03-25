package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer


*/
public class Solution {
    public static void main(String[] args) {
        String s= "level22.lesson13.task01";
        System.out.println(Arrays.toString(getTokens(s,".")));

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] temp = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = stringTokenizer.nextToken();
            }
        }

        return temp;
    }
}
