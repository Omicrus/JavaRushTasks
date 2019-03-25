package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
 можно делать перебор не самих чисел, а значений, которые могут получаться в результате степенной суммы ( т.е. суммы цифр числа, возведенных в степень числа цифр этого числа ).

  Здесь используется следующее свойство : от перемены цифр местами в числе степенная сумма не меняется. Т.е. например, незачем рассматривать все числа из класса : 135, 153, 315, 351, 531 и 513; достаточно рассмотреть одно из них, например, число 135; вычислить его степенную сумму : (135)ст = 153, а потом лишь убедиться в том что число 153 - это число Армстронга. Этот метод снижает число перебираемых чисел почти в N! раз. Сам же перебор осуществляется довольно просто : рассматриваются все числа, у которых любая цифра не меньше предыдущей и не больше последующей. Например: 12, 1557, 333 и т.д.
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result;
        ArrayList<Integer> armstrong = new ArrayList<>();

        for (int i = 1; i <= N; i++) {

            int temp = 0;
            if (isCrescent(i)) {

                temp = summa(i);
                int isArmstrong = summa(temp);
                if (i == isArmstrong) {
                    armstrong.add(i);
                }

            }

        }


        result = new long[armstrong.size()];
        for (int i = 0; i < armstrong.size(); i++) {
            result[i] = armstrong.get(i);
        }
        return result;
    }


    public static int summa(int a) {
        int summa = 0;
        int lenght = lenght(a);
        while (!(a == 0)) {
            int number = a % 10;
            summa = summa + pow(number, lenght);
            a /= 10;
        }
        return summa;
    }

    public static int pow(int a, int b) {
        int stepNumb = a;

        for (int i = 1; i < b; i++) {
            stepNumb = stepNumb * a;

        }
        return stepNumb;
    }

    public static int lenght(long N) {
        int lenght = 0;
        while (!(N == 0)) {
            lenght++;
            N /= 10;
        }
        return lenght;
    }


    public static boolean isCrescent(int a) {
        boolean result = false;
        while (!(a == 0)) {
            int coada = a % 10;
            int halfNumber = a / 10;
            if (coada >= (halfNumber % 10)) {
                result = true;
                a = halfNumber;
            } else {
                result = false;
                break;
            }
        }
        return result;

    }


    public static void main(String[] args) {

        /*long start = System.currentTimeMillis();
        long[] array = getNumbers(Integer.MAX_VALUE);
        long end = System.currentTimeMillis() - start; // считаю сколько секунд длилась "программа"

        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); // считаю сколько памяти было занято.
        System.out.println("Time = " + end / 1000);
        System.out.println("Memory = " + memore / 1048576);*/

    }
}
