package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());

            if (a == -1) {

                System.out.println((double)sum / count);
                break;
            }
            sum += a;
            count++;
        }
    }
}

