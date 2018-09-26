package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) throws Throwable {
        //напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            dog.finalize();
            cat.finalize();
        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
