package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            int m = fileReader.read();
            stringBuilder.append((char) m);
        }
        String phrase = stringBuilder.toString();
        int count = 0;
        String[] s1 = phrase.split("[.,!?;'`\":\\s\\n]");
        for (String s : s1) {
            if (s.matches("world")) count++;
        }
        System.out.println(count);


        fileReader.close();
    }
}
