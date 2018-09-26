package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Дата должна содержать день, месяц и год, разделенные пробелом.
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

      /*  DateFormat dateFormat1 = new SimpleDateFormat("dd MM yyyy");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat1.format(cal.getTime()));
*/
    }
}
