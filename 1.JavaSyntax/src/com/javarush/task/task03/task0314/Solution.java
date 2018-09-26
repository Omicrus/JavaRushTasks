package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Integer[] masivOrizontl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Integer[] masivVertical = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <masivOrizontl.length ; i++) {
            for (int j = 0; j <masivVertical.length ; j++) {
                System.out.print(masivOrizontl[i]*masivVertical[j]+ " ");

            }
            System.out.println("");

        }
    }
}
