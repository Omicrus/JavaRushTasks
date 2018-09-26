package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
      /*  ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        int[] list2 = new int[5];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(list2);

        for (int i = 0; i <list2.length  ; i++) {
            System.out.println(list2[i]);
        }
    }
}
