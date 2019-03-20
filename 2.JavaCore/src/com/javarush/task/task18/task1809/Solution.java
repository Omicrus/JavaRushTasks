package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i = buffer.length -1; i >= 0; i--) {
                outputStream.write(buffer[i]);
            }
        }

        inputStream.close();
        outputStream.close();
    }
}
