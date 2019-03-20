package com.javarush.task.task18.task1816;

/* 
Английские буквы
3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]); // change path of file
        int count = 0;
        String alfabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (inputStream.available() > 0) {
            String letter = String.valueOf((char)inputStream.read());
            if (alfabet.contains(letter)) {
               // System.out.print(letter);
                ++count;
            }
        }

        inputStream.close();
        System.out.println(count);
    }
}
