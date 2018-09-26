package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> list = new HashMap<>();
        list.put("Slabari", "Boris");
        list.put("Slabar", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");
        list.put("Slabari", "Boris");

        return list;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
