package com.javarush.task.task15.task1510;

/* 
Все лишнее - прочь!
Убрать в методе main лишние строки, для которых метод add не реализован.


Требования:
1. В классе Solution должно быть реализовано три метода add.
2. Метод main не должен содержать вызов метода add с параметрами "1" и 2d.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
    /* //   add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
     //   add("1",2d);
        add((byte) 1, 2d);*/
    Cat cat = new Cat();
        System.out.println(cat.name);
    }
   static class Pet
    {
        public String name = "rijik";
    }
    static class Cat extends Pet
    {
        int x = 5;
        int y = 5;
    }
   /* public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }*/
}
