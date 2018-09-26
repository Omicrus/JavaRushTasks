package com.javarush.task.task05.task0518;

/*
Регистрируем собачек
У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
5. У класса должен быть конструктор, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
6. У класса должен быть конструктор, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.
*/


public class Dog {
    //напишите тут ваш код
    String name;
    int height;
    String color;

    public Dog(String name) {
        this.name = name;
    }
    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }



    public static void main(String[] args) {

    }
}
