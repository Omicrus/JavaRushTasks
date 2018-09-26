package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.

String oldDateString = "2015-05-15";
 SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
 SimpleDateFormat newDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());

 Date date = oldDateFormat.parse(oldDateString);
 String result = newDateFormat.format(date);
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String stringDate = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy");

        Date newDate = dateFormat.parse(stringDate);
        String result = dateFormat1.format(newDate).toUpperCase();
        //     System.out.println("new date cititt din string:   " + newDate);
//        System.out.println("ultim:   " + ultimDate);
        System.out.println(result);
    }
}
