package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;


        // записываем данные в буффер
        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] == 44) count++;
            }
            System.out.println(count);
        }




        inputStream.close();
    }
}
