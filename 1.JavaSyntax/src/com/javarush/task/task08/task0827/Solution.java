package com.javarush.task.task08.task0827;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 31 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM dd yyyy", Locale.ENGLISH);

        Date currentDate = df.parse(date);

        Date startDate = new Date();
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        startDate.setMonth(0);
        startDate.setDate(0);
        startDate.setYear(currentDate.getYear());

        long msTimeDistances = currentDate.getTime() - startDate.getTime();
        long msTimesOnDay = 24 * 60 * 60 * 1000;
        long days = (msTimeDistances / msTimesOnDay);
        System.out.println(days);
        return days % 2 == 0;

    }
}
