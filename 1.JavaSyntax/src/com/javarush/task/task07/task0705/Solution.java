package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine()) ;
        }
        for (int i = 0; i <array1.length ; i++) {
            array1[i] = array[i];
            array2[i] = array[i+10];
        }
        for (int i = 0; i <array2.length ; i++) {
            System.out.println(array2[i]);
        }
    }
}
