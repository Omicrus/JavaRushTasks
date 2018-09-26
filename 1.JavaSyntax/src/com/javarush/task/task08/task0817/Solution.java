package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> citizen = new HashMap<>();
        citizen.put("Slabari", "Boris");
        citizen.put("OK", "Boris");
        citizen.put("Slbari", "Boris");
        citizen.put("Sbari", "Boris");
        citizen.put("bari", "Boris");
        citizen.put("Slaari", "Boris");
        citizen.put("Slari", "Boris");
        citizen.put("Slabai", "Bori");
        citizen.put("Slabar", "Boris");
        citizen.put("labari", "Boris");
        return citizen;

    }

/*
    4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
    5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {          ////iterator
            int m = Collections.frequency(copy.values(), pair.getValue());////count frequency of all value
            if (m > 1)
                removeItemFromMapByValue(map, pair.getValue());                        ////remove key with duplicate value

        }
        //   System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }
}
