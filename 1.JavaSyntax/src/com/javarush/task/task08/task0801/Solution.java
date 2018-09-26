package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> list = new HashSet<>();
        Collections.addAll(list, "арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень",
                "земляника", "ирис", "картофель");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }

        for (String s : list) {
            System.out.println(s);

        }

    }
}
