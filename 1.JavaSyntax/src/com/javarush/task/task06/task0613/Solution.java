package com.javarush.task.task06.task0613;

/* 
Кот и статика
Создай конструктор [public Cat()].
Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
 Создать 10 объектов Cat и вывести значение переменной catCount на экран.*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        for (int i = 0; i <10 ; i++) {
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
        //выведи значение переменной catCount
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;

        //создай конструктор
        public Cat(){
            catCount++;
        }
    }
}
