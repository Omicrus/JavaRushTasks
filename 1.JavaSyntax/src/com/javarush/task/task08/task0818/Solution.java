package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Slabari", 0);
        salaryMap.put("Slabar", 100);
        salaryMap.put("Slaba", 1000);
        salaryMap.put("Slab", 10000);
        salaryMap.put("Sla", 0);
        salaryMap.put("Sl", 0);
        salaryMap.put("S", 0);
        salaryMap.put("Slabari1", 500);
        salaryMap.put("Slabari2", 550);
        salaryMap.put("Slabari3", 520);
        return salaryMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        //////////FIRST method/////////
            map.entrySet().removeIf(value -> (value.getValue() < 500));
        ////////Second method through
        HashMap<String, Integer> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, Integer>> itr = copy.entrySet().iterator();
        while (itr.hasNext()) {
            HashMap.Entry<String, Integer> pair = itr.next();
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
        //////Third method/////
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(createMap());
        removeItemFromMap(map);
        System.out.println(map);
    }
}