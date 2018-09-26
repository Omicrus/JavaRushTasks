package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Требования:


3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainArray = new ArrayList<>();
        ArrayList<Integer> arrayBy3 = new ArrayList<>();
        ArrayList<Integer> arrayBy2 = new ArrayList<>();
        ArrayList<Integer> arrayOther = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            mainArray.add(Integer.parseInt(reader.readLine()));
            int x = mainArray.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                arrayBy3.add(x);
                arrayBy2.add(x);
            } else if (x % 3 == 0) {
                arrayBy3.add(x);
            } else if (x % 2 == 0) {
                arrayBy2.add(x);
            } else {
                arrayOther.add(x);
            }

        }
        printList(arrayBy3);
        printList(arrayBy2);
        printList(arrayOther);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
