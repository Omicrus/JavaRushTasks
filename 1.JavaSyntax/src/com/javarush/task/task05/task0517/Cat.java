package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 5;
    int weight = 5;
    String address = null;
    String color = "red";
    //У класса должен быть конструктор, принимающий в качестве параметра имя,
    // но инициализирующий все переменные класса, кроме адреса.
    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "red";
        this.address = null;
    }
    //У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст
    // и инициализирующий все переменные класса, кроме адреса.
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
        this.address = null;
    }
   // У класса должен быть конструктор, принимающий в качестве параметров имя, возраст
    // и инициализирующий все переменные класса, кроме адреса.
   public Cat(String name, int age){
       this.name = name;
       this.age = age;
       this.weight = 5;
       this.color = "red";
       this.address = null;
   }
   //У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и
    // инициализирующий все переменные класса, кроме имени и адреса.
   public Cat(int weight, String color){
       this.name = null;
       this.age = 5;
       this.weight = weight;
       this.color = color;
       this.address = null;
   }
   // У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес
   // и инициализирующий все переменные класса, кроме имени.
   public Cat(int weight, String color, String address){
       this.name = null;
       this.age = 5;
       this.weight = weight;
       this.color = color;
       this.address = address;
   }
    public static void main(String[] args) {

    }
}
