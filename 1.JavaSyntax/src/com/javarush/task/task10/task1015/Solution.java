package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш
        ArrayList<String>[] lists =  (ArrayList<String>[])new ArrayList[2];
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        Collections.addAll(arrayList, "adwdwadawda", "dwdwadada" , "dwdwdawda" , "dwdwdwdwd");
        Collections.addAll(arrayList1, "adwdwad", "dwdwada" , "dwdawda" , "dwdwd");
       lists[0] = arrayList;
       lists[1] = arrayList1;

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}