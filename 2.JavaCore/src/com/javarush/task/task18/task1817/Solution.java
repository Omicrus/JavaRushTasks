package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        /** Посчитать количество всех символов.*/
        int totalSimbol = (new char[fileInputStream.available()]).length; // Посчитать количество всех символов.
        int totalWhiteSpaces = 0;
        /** Посчитать количество пробелов.*/
        while (fileInputStream.available() > 0) {// fileInputSteam ==== int
            int temp = fileInputStream.read();
            if (32 == temp) {
                totalWhiteSpaces++;
            }
        }
        /** Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.*/
        double result = ((totalWhiteSpaces / totalSimbol) * 100);
        String formatedFloat = new DecimalFormat("#0.00").format(result);
        System.out.println(formatedFloat);
        fileInputStream.close();
    }
}
