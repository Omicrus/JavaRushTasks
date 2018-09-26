package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(middleNumber(a, b, c));

    }

    public static int middleNumber(int a, int b, int c) {
        if (a >= b && b >= c) return b;
        if (a <= b && b <= c) return b;
        if (b >= a && a >= c) return a;
        if (b <= a && a <= c) return a;
        if (a <= c && c <= b) return c;
        else return c;


    }
}
