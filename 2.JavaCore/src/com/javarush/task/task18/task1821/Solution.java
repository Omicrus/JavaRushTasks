package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileInputStream inputStreamReader = new FileInputStream(args[0]);

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        while (inputStreamReader.available() > 0) {
            int n = inputStreamReader.read();

            if (hashMap.containsKey(n)) {

                int value = hashMap.get(n);
                hashMap.put(n, value + 1);

            } else {
                hashMap.put(n, 1);
            }
        }
        TreeMap<Integer, Integer> sorted = new TreeMap<>(hashMap);

        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {


            System.out.println(((char)(int)entry.getKey()) +
                    " " + entry.getValue());

        }

        inputStreamReader.close();
    }


}
