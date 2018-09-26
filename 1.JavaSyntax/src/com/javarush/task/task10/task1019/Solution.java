package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
         Map<String, String> map = new HashMap<String, String>();
    map.put("first", "Mama");
    map.put("second", "Mila");
    map.put("third", "Ramu");

    for (Map.Entry<String, String> pair : map.entrySet())
    {
        String key = pair.getKey();                      //ключ
        String value = pair.getValue();                  //значение
        System.out.println(key + ":" + value);
    }
        */

        Map<String, Integer> mapList = new HashMap<>();
        boolean input = true;
        while (input) {

            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                mapList.put(name, id);
            } catch (NumberFormatException e) {
                for (HashMap.Entry<String,Integer> k : mapList.entrySet()) {
                    String n = k.getKey();
                    int value = k.getValue();
                    System.out.println(value + "   " + n);
                    input = false;
                }
            }
        }

        //   System.out.println("Id=" + id + " Name=" + name);
    }
}
