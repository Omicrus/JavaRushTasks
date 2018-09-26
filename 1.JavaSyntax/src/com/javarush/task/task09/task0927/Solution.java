package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> listMap = new HashMap<>();
        listMap.put("Vasika",new Cat("Vasika"));
        listMap.put("Barsik",new Cat("Barsik"));
        listMap.put("Kisa",new Cat("Kisa"));
        listMap.put("Murka",new Cat("Murka"));
        listMap.put("Antoska",new Cat("Antoska"));
        listMap.put("Archi",new Cat("Archi"));
        listMap.put("Rozita",new Cat("Rozita"));
        listMap.put("Concita",new Cat("Concita"));
        listMap.put("Risik",new Cat("Risik"));
        listMap.put("Pele",new Cat("Pele"));

        return listMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
