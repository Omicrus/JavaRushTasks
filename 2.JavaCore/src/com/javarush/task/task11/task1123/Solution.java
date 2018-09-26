package com.javarush.task.task11.task1123;

/*
Минимакс
Написать метод, который возвращает минимальное и максимальное числа в массиве.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Класс Pair не изменять.
3. Метод main не изменять.
4. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
5. Программа должна вывести правильный результат.
6. Метод main должен вызывать метод getMinimumAndMaximum.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);

        }
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        /*List<Integer> list = Arrays.stream(array)
                .boxed().collect(Collectors.<Integer>toList());
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println(min +" , "+max);*/

        //Напишите тут ваше решение

        Arrays.sort(array);
        int minimum = array[0];
        int maximum = array[array.length-1];

        return new Pair<Integer, Integer>(minimum, maximum);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
