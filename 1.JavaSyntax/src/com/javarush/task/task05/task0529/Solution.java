package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String input = reader.readLine();
            if (input.equals("сумма")) {
                break;
            } else {
                int a = Integer.parseInt(input);
                sum += a;

            }
        }
        System.out.println(sum);
    }
}

