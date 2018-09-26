package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("vanea",45,"gradinilor 43");
        Man man2 = new Man("Ion", 25, "via della fiera 25");
        Woman woman1 = new Woman("Anna", 23, "parazitilo 30");
        Woman woman2 = new Woman("tanea", 30, "gradinilor 32");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name = "Zina";
        int age = 25;
        String address = null;

        public Man() {

        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman() {

        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
