package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
Требования:
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (min > list.get(i).length()) {
                min = list.get(i).length();
            }
            if (max < list.get(i).length()) {
                max = list.get(i).length();
            }
        }
///////first method
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            } else if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }

        }
        ////////second method
        for (String aList : list) {
            if (aList.length() == min) {
                System.out.println(aList);
                break;
            } else if (aList.length() == max) {
                System.out.println(aList);
                break;
            }

        }


    }
}
