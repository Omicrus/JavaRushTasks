package com.javarush.task.task12.task1219;

/* 
Создаем человека
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).


Требования:
1. Класс Solution должен содержать интерфейс Fly с одним методом fly().
2. Класс Solution должен содержать интерфейс Run с одним методом run().
3. Класс Solution должен содержать интерфейс Swim с одним методом swim().
4. Человек должен уметь бегать и плавать.
5. Утка должна уметь летать, плавать и бегать.
6. Пингвин должен уметь плавать и бегать.
7. Самолет должен уметь летать и ездить.
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


    public class Human implements Run, Swim {
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Swim, Fly, Run {
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

    public class Airplane implements Fly, Run {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
