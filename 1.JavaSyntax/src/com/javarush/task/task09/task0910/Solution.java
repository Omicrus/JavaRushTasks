package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
          //  e.printStackTrace();
            System.out.println("IndexOutOfBoundsException: Index: 18, Size: 0");
        }

        //напишите тут ваш код
    }
}