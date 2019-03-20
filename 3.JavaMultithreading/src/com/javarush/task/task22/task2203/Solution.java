package com.javarush.task.task22.task2203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {


        try {
            Pattern pattern = Pattern.compile("\\t");
            Matcher matcher = pattern.matcher(string);
            int count = 0;
            while (matcher.find()) {
                count++;
            }

            if (count < 2) {
                throw new Exception();
            }
            String[] words = string.split("\\t");
            return words[1];
        } catch (Exception e) {
            throw new TooShortStringException();
        }

    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println((getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t.")));
        System.out.println((getPartOfString("обучения Java\t.")));
    }

    public static class TooShortStringException extends Exception {
    }
}
