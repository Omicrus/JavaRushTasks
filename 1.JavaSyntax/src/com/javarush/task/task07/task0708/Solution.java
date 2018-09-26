package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (max <= strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }

        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() == max) {
                System.out.println(strings.get(j));
            }
        }
    }

}

