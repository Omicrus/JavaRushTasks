package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(0);

    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        while (month >= 0 & month <= 13) {

            if (month == 12 | month <= 2) {
                System.out.println("зима");
            }
            if (month >= 3 & month <= 5) {
                System.out.println("весна");
            }
            if (month >= 6 & month <= 8) {
                System.out.println("лето");
            }
            if (month >= 9 & month <= 11) {
                System.out.println("осень");
            }break;
        }


    }
}