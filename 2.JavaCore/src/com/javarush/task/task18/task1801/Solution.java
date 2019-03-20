package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        int m = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (inputStream.available() > 0) {


            arrayList.add(inputStream.read());
        }

        inputStream.close();

        m = Collections.max(arrayList);
        System.out.println("maximum: " + m);


    }
}
