package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);

    }

    public static void closeToTen(int a, int b) {
        //напишите тут ваш код
        int i = a - 10;
        int j = b - 10;
        int x = abs(i);
        int y = abs(j);

        if (x < y) {
            System.out.println(a);
        }
        if (abs(i) > abs(j)) {
            System.out.println(b);
        }
        if (abs(i) == abs(j)) {
            System.out.println(a);
        }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}