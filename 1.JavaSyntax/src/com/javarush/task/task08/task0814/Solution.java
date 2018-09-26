package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(10 + i);
        }

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        /////first method/////////
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int i = list.size(); i > 0; i--) {
            if (list.get(i - 1) <= 10) list.remove(list.get(i - 1));
        }
        for (Integer aList : list) {
            set.remove(aList);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10Second(HashSet<Integer> set) {
        //напишите тут ваш код

        /////second method//////////
        set.removeIf(i -> i > 10);  ///лямда операция
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10Third(HashSet<Integer> set) {
        //напишите тут ваш код
        /////third method//////////
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            int i = (int) itr.next();
            if (i > 10) { // filter all ints bigger than 10
                itr.remove();
            }
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10Fourth(HashSet<Integer> set) {
        //напишите тут ваш код
        /////fourth method ////////////
        for (int i = 11; i < Integer.MAX_VALUE; i++) {
            if (set.contains(i)) set.remove(i);
        }
        return set;

    }


    public static void main(String[] args) {
        Date startTime = new Date();
        removeAllNumbersMoreThan10(createSet());
        removeAllNumbersMoreThan10Second(createSet());
        removeAllNumbersMoreThan10Third(createSet());
        removeAllNumbersMoreThan10Fourth(createSet());

        Date endTime = new Date();

        long msDelay = endTime.getTime() - startTime.getTime();

        System.out.println(msDelay);

    }


}
