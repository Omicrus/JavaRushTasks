package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }
    /*public Cat(int age, int weight, int strength){
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }*/

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int countPointFirstCat = 0;
        int countPointSecondCat = 0;

        if (this.age > anotherCat.age) {
            countPointFirstCat++;
        } else countPointSecondCat++;
        if (this.weight > anotherCat.weight) {
            countPointFirstCat++;
        } else countPointSecondCat++;
        if (this.strength > anotherCat.strength) {
            countPointFirstCat++;
        } else countPointSecondCat++;
        return countPointFirstCat > countPointSecondCat;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
  //      System.out.println(cat1.fight(cat2));


    }
}
