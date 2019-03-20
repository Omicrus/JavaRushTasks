package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        Iterator<HashMap.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
          //  System.out.println(iter); // aici se va vedea doar referinta la un element din map
            Map.Entry<String, String> pair = iter.next();
          //  System.out.println(pair);// vom vedea ca rezultat perechea ce o da ca referinta iterul
            // si se va afisa in mod normal
            /////// prin metoda de mai jos putem scoate din pereche: cheia sau valoarea si le prelucram.
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey()+ " - " + pair.getValue());
        }

    }
}
