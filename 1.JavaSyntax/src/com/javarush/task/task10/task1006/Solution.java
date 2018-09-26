package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0

*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;                       // d = 250.0,   (short) 2.50256e2d =  250     , 250.256
        char c = (short) 'd';                                // c = d        (short) 'd'        =  100
        short s = (short) 2.22;                              // s = 2        (short) 2.22       =  2
        int i =  150000;                              // i = 18928    (short) 150000     =  18928
        float f =  0.50f;                             // f = 0.0      (short) 0.50f      =  0
        double result = f + (i / c) - (d * s) - 500e-3;      // 0.0 + (18928/100) - (250.0 * 2) - 0.5     // 0.0 + 189 - 500 - 0.5
        System.out.println("result: " + result);       // -311.5
    }
}