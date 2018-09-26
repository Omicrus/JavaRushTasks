package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        String sp = " ";
        if (a >= b && b >= c) System.out.println(a + sp + b + sp + c);
        else if (a >= c && c >= b) System.out.println(a + sp + c + sp + b);
        else if (b >= a && a >= c) System.out.println(b + sp + a + sp + c);
        else if (b >= c && c >= a) System.out.println(b + sp + c + sp + a);
        else if (c >= a && a >= b) System.out.println(c + sp + a + sp + b);
        else if (c >= b && b >= a) System.out.println(c + sp + b + sp + a);
    }
}
