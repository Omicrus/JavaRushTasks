package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age = 2;
    int weight = 2;
    String color;
    String address;
//У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 8;
        this.color = "red";
        this.address = null;
    }
    //У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
        this.address = null;

    }

    //- Имя, возраст (вес стандартный)
    //У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 2;
        this.age = age;
        this.color = "red";
    }
//У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
    //   - вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = null;
        this.age = 3;
    }
    //У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
    //- вес, цвет, адрес (чужой домашний кот)
    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
