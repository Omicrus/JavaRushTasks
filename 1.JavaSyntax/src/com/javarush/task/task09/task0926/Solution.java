package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Collections;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();


        int[] massiv1 = new int[5];
        int[] massiv2 = new int[2];
        int[] massiv3 = new int[4];
        int[] massiv4 = new int[7];
        int[] massiv5 = new int[0];
        for (int i = 0; i < massiv1.length; i++) {
            massiv1[i] = 10 + i;
        }
        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i] = 150 + i;
        }
        for (int i = 0; i < massiv3.length; i++) {
            massiv3[i] = 75 + i;
        }
        for (int i = 0; i < massiv4.length; i++) {
            massiv4[i] = 222 + i;
        }

        Collections.addAll(arrayList, massiv1, massiv2, massiv3, massiv4, massiv5);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
