package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (true) try {
                int number = Integer.parseInt(reader.readLine());
                arrayList.add(number);
            } catch (NumberFormatException e) {
                for (Integer n : arrayList) {
                    System.out.println(n);
                }
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
