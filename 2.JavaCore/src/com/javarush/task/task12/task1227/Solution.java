package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)


Требования:
1. Класс Solution должен содержать интерфейс Fly с методом void fly().
2. Класс Solution должен содержать интерфейс Swim с методом void swim().
3. Класс Solution должен содержать интерфейс Run с методом void run().
4. Класс Solution должен содержать классы Duck, Penguin, Toad.
5. Объект класса Duck должен уметь летать(поддерживать интерфейс Fly), бегать(поддерживать интерфейс Run) и плавать(поддерживать интерфейс Swim).
6. Объект класса Penguin должен уметь бегать(поддерживать интерфейс Run) и плавать(поддерживать интерфейс Swim).
7. Объект класса Toad должен уметь только плавать(поддерживать интерфейс Swim).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Fly, Run, Swim {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Swim, Run {
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements Swim {
        @Override
        public void swim() {

        }
    }
}
