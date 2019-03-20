package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");

    }

    public static void main(String[] args) throws IOException {


        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(fileName.readLine()));
        fileName.close();

        while (reader.ready()) {
            String[] words = reader.readLine().split("\\s+");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                for (Map.Entry<Integer, String> number : map.entrySet()) {
                    if (words[i].matches("\\b[0-9][0-9]{0,1}\\b") && (words[i].equals(number.getKey().toString()))) {
                        words[i] = number.getValue();
                    }
                }
                stringBuilder.append(words[i]).append(" ");
            }
            System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
        }
        reader.close();

    }


}
