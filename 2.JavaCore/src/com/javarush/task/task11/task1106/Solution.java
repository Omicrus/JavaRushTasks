package com.javarush.task.task11.task1106;

/* 
Скрытный инкапсулированный кот
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name + ", "+ cat.age+", " + cat.weight);
        System.out.println(cat);
        cat.name = "assa";
        System.out.println(cat);
        cat = new Cat("murka", 4,5);
        System.out.println(cat.name + ", "+ cat.age+", " + cat.weight);
        System.out.println(cat);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}

