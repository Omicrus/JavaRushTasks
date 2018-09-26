package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Slabari", df.parse("MAY 18 1985"));
        map.put("Stanila", df.parse("FEBRUARY 8 1980"));
        map.put("Morari", df.parse("AUGUST 23 1980"));
        map.put("Mihailov", df.parse("JANUARY 3 1980"));
        map.put("Onoje", df.parse("AUGUST 31 1980"));
        map.put("Craiov", df.parse("OCTOBER 1 1980"));
        map.put("Didi", df.parse("JUNE 1 1980"));
        map.put("Ambrogio", df.parse("FEBRUARY 1 1980"));
        map.put("Nimeni", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

       /////////////////first method///////////////////////////
       /* Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Date> entry = iter.next();
            if((entry.getValue().getMonth() > 4) && (entry.getValue().getMonth() < 8)){
                iter.remove();
            }
        }
        System.out.println(map);*/


     //////////////////////////////   second method/////////////////
        map.entrySet().removeIf(entry -> (entry.getValue().getMonth() > 4) && (entry.getValue().getMonth() < 8));
        System.out.println(map);
    }

    public static void main(String[] args) throws ParseException {
removeAllSummerPeople(createMap());
    }
}
