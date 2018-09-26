package com.javarush.task.task04.task0407;

/* 
Кошки во Вселенной
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        cat1.setCount();

        Cat cat2 = new Cat();
        //напишите тут ваш код
        cat2.setCount();

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;

        public static void setCount() {
            Cat.count = Cat.count + 1;
        }
    }
}