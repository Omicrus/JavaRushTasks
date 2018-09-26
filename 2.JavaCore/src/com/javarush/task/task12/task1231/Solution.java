package com.javarush.task.task12.task1231;

/* 
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там где надо и удали там, где они не нужны.


Требования:
1. Класс Pegas должен реализовывать интерфейс Fly.
2. Класс Pegas должен наследоваться от класса Horse.
3. Класс SwimPegas должен наследоваться от класса Pegas.
4. Обьект класса Horse создать можно.
5. Обьект класса Pegas создать можно.
6. Метод swim() класса SwimPegas не должен иметь реализации.
*/

public class Solution {

    public static void main(String[] args) {

        Horse horse = new Pegas();
        horse.run();
    }

    public interface Fly {
         void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        public  void fly() {

        }
    }

    public static abstract class SwimPegas extends Pegas {
        public abstract void swim();
    }

}
