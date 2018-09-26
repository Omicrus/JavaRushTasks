package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String m = String.valueOf(n);

        if (n > 0 && n < 1000) {
            if (m.length() == 1) {
                System.out.println((n % 2 == 0) ? ("четное однозначное число") : ("нечетное однозначное число"));
            } else if (m.length() == 2) {
                System.out.println((n % 2 == 0) ? ("четное двузначное число") : ("нечетное двузначное число"));
            } else if (m.length() == 3) {
                System.out.println((n % 2 == 0) ? ("четное трехзначное число") : ("нечетное трехзначное число"));
            }

        }
    }
}
