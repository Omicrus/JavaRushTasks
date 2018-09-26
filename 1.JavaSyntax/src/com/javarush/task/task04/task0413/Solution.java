package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n >= 1 & n <= 7) {
            if (n == 1) {
                System.out.println("понедельник");
            }
            if (n == 2) {
                System.out.println("вторник");
            }
            if (n == 3) {
                System.out.println("среда");
            }
            if (n == 4) {
                System.out.println("четверг");
            }
            if (n == 5) {
                System.out.println("пятница");
            }
            if (n == 6) {
                System.out.println("суббота");
            }
            if (n == 7) {
                System.out.println("воскресенье");
            }
        }if (n <= 0 | n >= 8)
        {
            System.out.println("такого дня недели не существует");
        }
    }
}