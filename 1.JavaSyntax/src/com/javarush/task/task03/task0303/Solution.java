package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    /**
     * programa converteste cursul
     * @param args porneste programa
     */
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(20,3));
        System.out.println(convertEurToUsd(30,3));
    }


    /**
     * metoda de convertire
     * @param eur ii dam valoare la euro
     * @param course ii dam valoare la curs
     * @return eur * course
     */
    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
