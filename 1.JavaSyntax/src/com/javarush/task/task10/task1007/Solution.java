package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов 1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;
*/

public class Solution {
    public static void main(String[] args) {
        long l =  1234_564_890L;             // 26
    //    System.out.println(l);
        int x =  0b1000_1100_1010;          // -54
    //    System.out.println(x);
        double m = (byte) 110_987_654_6299.123_34;  // -1.0
     //   System.out.println(m);
        float f =  l++ + 10 + ++x - (float) m;   // -16.0
    //    System.out.println(f);
        l = (long) f / 1000;                       // 0
        System.out.println(l);


    }
}