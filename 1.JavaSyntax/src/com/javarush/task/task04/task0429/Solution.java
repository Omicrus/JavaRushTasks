package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int pos = 0;
        int neg = 0;
        int a;
        for (int i = 0; i < 3; i++) {
            a = Integer.parseInt(reader.readLine());

            if (a > 0) pos++;
            else if (a < 0) neg++;
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);*/
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;
        while (!isExit)
        {
            String s = buffer.readLine();
            System.out.println(isExit);
            isExit = s.equals("exit");
            System.out.println(isExit);

        }
        System.out.println("dupa while" + isExit);
    }
}
