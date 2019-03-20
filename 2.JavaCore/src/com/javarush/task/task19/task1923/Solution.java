package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        Pattern pattern = Pattern.compile("\\d");
        while (reader.ready()) {
            String[] line = reader.readLine().trim().split("\\s+");

            for (String s : line) {
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()) {
                    System.out.println(s);
                    fileWriter.write(s + " ");
                }
            }
        }
        fileWriter.close();
        reader.close();


    }
}
