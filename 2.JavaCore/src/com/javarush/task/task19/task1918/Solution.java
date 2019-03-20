package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfr = new BufferedReader(new FileReader(reader.readLine()));
        StringBuilder sb = new StringBuilder();
        while (bfr.ready()) {
            sb.append(bfr.readLine());
        }
        reader.close();
        bfr.close();
        String stringLine = sb.toString();
        Pattern pattern = Pattern.compile("(<\\s?\\/?\\s?" + args[0] + ".*?>)");
        Matcher matcher = pattern.matcher(stringLine);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int count = 0;
        while (matcher.find()) {
            if (matcher.group().matches("(<\\s?" + args[0] + ".*?>)")) {
                count++;
                treeMap.put(matcher.start(), count);
            } else if (matcher.group().matches("(<\\/" + args[0] + ".*?>)")) {
                for (Map.Entry<Integer, Integer> item : treeMap.entrySet()) {
                    if (item.getValue() == count) {
                        treeMap.put(item.getKey(), matcher.end());
                    }
                }
                count--;
            }
        }
        for (Map.Entry<Integer, Integer> item : treeMap.entrySet()) {
            System.out.println(stringLine.substring(item.getKey(), item.getValue()));
        }
    }
}