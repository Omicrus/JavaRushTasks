package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           File file = new File(reader.readLine());
          File file1 = new File(reader.readLine());
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1, true);
        StringBuilder list = new StringBuilder();

        while (fileInputStream.available() > 0) {
            list = list.append((char) (fileInputStream.read()));
        }
        fileInputStream.close();

        String[] listOfNumberString = list.toString().split(" ");

        list.delete(0, list.length());
        String temp = "";

        for (String s : listOfNumberString) {

            list.append(Math.round(Double.parseDouble(s)));
            list.append(" ");
        }
        temp = list.toString();
        byte[] buffer = temp.getBytes();

        fileOutputStream.write(buffer);
        fileOutputStream.close();
    }
}
