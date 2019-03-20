package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
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
        for (Map.Entry<String, Double> item : treeMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        bufferedReader.close();
    }
}
