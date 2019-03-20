package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(reader1.readLine()));
        reader1.close();

        while (reader.ready()) {
            int count = 0;
            String line = reader.readLine();
            for (int i = 0; i < words.size(); i++) {
                Pattern pattern = Pattern.compile("\\b" + words.get(i) + "\\b");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(line);
            }

        }


        reader.close();

    }
}
