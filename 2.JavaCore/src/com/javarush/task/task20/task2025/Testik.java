package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

public class Testik {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long[] array = getNumbers(10000000);
        long end = System.currentTimeMillis() - start; // считаю сколько секунд длилась "программа"

        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(); // считаю сколько памяти было занято.
        System.out.println("Time = " + end / 1000);
        System.out.println("Memory = " + memore / 1048576);

        System.out.println(Arrays.toString(array));

    }

    public static long[] getNumbers(long N) {
        long[] result;
        ArrayList<Integer> armstrong = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int temp = summa(i);
            if (isCrescent(i)) {
                int isArmstrong = summa(temp);
                if (temp == isArmstrong) {
                    if (!armstrong.contains(temp)) {
                        armstrong.add(temp);
                    }
                }
            }
        }
        result = new long[armstrong.size()];
        for (int i = 0; i < armstrong.size(); i++) {
            result[i] = armstrong.get(i);
        }
        return result;
    }

    public static boolean isCrescent(int a) {
        boolean result = false;
        while (!(a == 0)) {

            int coada = a % 10;
            int halfNumber = a / 10;
            if (coada >= (halfNumber % 10) | coada == 0) {
                result = true;
                a = halfNumber;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


    public static int summa(int a) {
        int summa = 0;
        int lenght = lenght(a);
        while (!(a == 0)) {
            int number = a % 10;
            summa = summa + (int)Math.pow(number,lenght);
            a /= 10;
        }
        return summa;
    }

    public static int lenght(int N) {
        int lenght = 0;
        while (!(N == 0)) {
            lenght++;
            N /= 10;
        }
        return lenght;
    }


}
