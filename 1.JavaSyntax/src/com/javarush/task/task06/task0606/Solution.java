package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int number_create;
        if (x < 0) {
            x = x * -1;
        }

        while (x != 0) {
            number_create = x % 10;
            if (number_create % 2 == 0) {
                even++;
            } else odd++;
            x = x / 10;
        }


        String number = String.valueOf(x);
        char[] num = number.toCharArray();
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else odd++;
        }


        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
