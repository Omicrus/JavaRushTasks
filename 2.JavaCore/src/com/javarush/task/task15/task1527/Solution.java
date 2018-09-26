package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* 
Парсер реквестов
*/
public class Solution {
    public static void main(String[] args) {
        //add your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            URL aURL = new URL(s);
            reader.close();
            String line = aURL.getQuery();
            String[] tip = line.split("&");
            for (String t : tip) {
                if (t.contains("=")) {
                    String[] fin = t.split("=");
                    System.out.print(fin[0] + " ");
                } else System.out.print(t + " ");
            }
            System.out.println();
            for (String t : tip) {
                if (t.contains("=")) {
                    String[] fin = t.split("=");

                    if (fin[0].equals("obj")) {
                        try {
                            alert(Double.parseDouble(fin[1]));
                        } catch (NumberFormatException e) {
                            alert(fin[1]);
                        }
                    }
                }
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
