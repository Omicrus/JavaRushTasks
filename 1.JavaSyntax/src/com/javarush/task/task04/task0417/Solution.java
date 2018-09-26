package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && b == c) {
            System.out.print(a + " " + b + " " + c);
        }
        if (a == b && b != c) {
            System.out.print(a + " " + b);
        }
        if (a == c && c != b) {
            System.out.print(a + " " + c);
        }
        if (c == b && c != a) {
            System.out.print(c + " " + b);
        }

        String p=" ";

        if((a==b && b==c)) System.out.println(a+p+b+p+c);
        else if(a==b) System.out.println(a+p+b);
        else if(a==c) System.out.println(a+p+c);
        else if(b==c) System.out.println(b+p+c);
    }
}