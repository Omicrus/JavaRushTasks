package com.javarush.task.task10.task1011;

/* 
Большая зарплата
Программа должна выводить текст на экран.
2. Программа должна выводить 40 строк.
3. В программе должен использоваться цикл for или while.
4. Выведенный текст должен соответствовать примеру из условия.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        /*for (int i = 0; i < 40 ; i++) {
            System.out.println(s.substring(i));
        }*/


        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j <temp.size() ; j++) {
                System.out.print(temp.get(j));
            }
            System.out.println("");
            temp.remove(0);
        }


    }

}

