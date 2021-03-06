package com.javarush.task.task22.task2212;

import java.util.regex.Pattern;

/*
Проверка номера телефона
Критерии валидности:
1) если номер начинается с '+', то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 0-2 знаков '-', которые не могут идти подряд
4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
5) скобки внутри содержат четко 3 цифры
6) номер не содержит букв
7) номер заканчивается на цифру

Примеры:
+380501234567 - true
+38(050)1234567 - true
+38050123-45-67 - true
050123-4567 - true
+38)050(1234567 - false
+38(050)1-23-45-6-7 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
//        1) если номер начинается с '+', то он содержит 12 цифр
//        2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
//        3) может содержать 0-2 знаков '-', которые не могут идти подряд
//        4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
//        5) скобки внутри содержат четко 3 цифры
//        6) номер не содержит букв
//        7) номер заканчивается на цифру
        if (telNumber != null) {
            return Pattern.matches("\\+*\\d{12}|\\+\\d{2}\\(\\d{3}\\)\\d{7}|\\+\\d{8}-\\d{2}-\\d{2}|\\d{6}-\\d{4}", telNumber);
        }

        return false;
    }

    public static void main(String[] args) {

        String[] telefon = new String[]{"+380501234567", "+38(050)1234567", "+38050123-45-67", "050123-4567", "+38)050(1234567",
                "+38(050)1-23-45-6-7", "050ххх4567", "050123456", "(0)501234567", "1234567897", "(123)4567899"};
        for (int i = 0; i < telefon.length; i++) {
            System.out.println(checkTelNumber(telefon[i]));
        }

    }
}
