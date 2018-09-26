package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
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
        citizen.put("Slabai", "Boris");
        citizen.put("Slabar", "Boris");
        citizen.put("labari", "Boris");
        return citizen;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        ///////////first method/////////
        int m = Collections.frequency(map.values(),name);
        System.out.println(m);
        ///////////Second method///////
        int count = 0;
        for (HashMap.Entry<String, String> s : map.entrySet()) {

            if (name.equals(s.getValue())) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (HashMap.Entry<String, String> s : map.entrySet()) {
            if (lastName.equals(s.getKey())) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(),"Boris"));
        System.out.println(getCountTheSameLastName(createMap(),"Slabari"));
    }
}
