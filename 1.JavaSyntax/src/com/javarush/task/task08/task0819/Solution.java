package com.javarush.task.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Set<Cat> cats = new HashSet<>();
        Collections.addAll(cats, cat1, cat2, cat3);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat s : cats) {
            System.out.println(s);

        }
    }

    // step 1 - пункт 1
    public static class Cat {

    }
}
