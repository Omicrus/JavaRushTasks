package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Map<Integer, Integer> bite = new HashMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (bite.containsKey(data)) {
                bite.put(data, 1 + bite.get(data));
            } else {
                bite.put(data, 1);
            }
        }
        inputStream.close();
        int count = Collections.min(bite.values());
        for (Map.Entry<Integer, Integer> m : bite.entrySet()) {
            if (m.getValue() == count)
                System.out.print(m.getKey() + " ");
        }


    }
}
