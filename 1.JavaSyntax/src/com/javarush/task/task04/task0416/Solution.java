package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minut = Double.parseDouble(reader.readLine());

        if (minut <= 0 | minut >= 60.1) {
            System.out.println("introdu cifrele corect");
        } else {
            double min = minut % 5;
          //  System.out.println(min);

            if (min >= 4 && min < 5) {

                System.out.println("красный");
            }
            if (min >= 3 && min < 4) {
                System.out.println("жёлтый");
            }
            if (min >= 0 && min < 3) {
                System.out.println("зелёный");
            }
        }
    }
}