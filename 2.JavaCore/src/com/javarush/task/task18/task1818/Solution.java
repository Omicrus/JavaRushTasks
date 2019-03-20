package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine(), true);
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileInputStream fileInputStream1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        /** Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.*/
        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
            fileOutputStream1.write(buffer);
        }
        fileInputStream.close();

        buffer = new byte[fileInputStream1.available()];
        while (fileInputStream1.available() > 0) {
            fileInputStream1.read(buffer);
            fileOutputStream1.write(buffer);
        }

        fileOutputStream1.close();
        fileInputStream1.close();


    }
}
