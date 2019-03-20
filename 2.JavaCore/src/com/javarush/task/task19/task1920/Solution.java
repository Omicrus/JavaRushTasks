package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> treeMap = new TreeMap<>();
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] temp = line.split(" ");
            treeMap.merge(temp[0], Double.parseDouble(temp[1]), (v, newV) -> v + newV);
        }
        Double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> item : treeMap.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
            }

        }
        for (Map.Entry<String, Double> item : treeMap.entrySet()) {
            if (item.getValue().equals(max)) {
                System.out.println(item.getKey());
            }
        }
        bufferedReader.close();
    }
}
