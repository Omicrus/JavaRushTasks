package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //   System.out.println("Stringul intreg: " + s);

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        char[] list = s.toCharArray();

        for (int i = 0; i < list.length; i++) {
            if (i == 0 || list[i - 1] == ' ') {
                list[i] = Character.toUpperCase(list[i]);
            }
        }
        s = new String(list);
        System.out.println(s);


      /*  StringBuilder listOfString = new StringBuilder(s);
        for (int i = 0; i < listOfString.length(); i++) {
            if (i == 0 || listOfString.charAt(i - 1) == ' ') {
                listOfString.setCharAt(i, Character.toUpperCase(listOfString.charAt(i)));
            }
        }
        s = listOfString.toString();
        System.out.println(s);*/


        //напишите тут ваш код

        //напишите тут ваш код
    }
}
