package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
Требования:
1. Добавь в класс Cat публичную статическую переменную cats (ArrayList).
2. Переменная cats должна быть проинициализирована.
3. Метод main должен создавать 10 объектов Cat (используй конструктор Cat()).
4. Метод main должен добавить всех созданных котов в переменную cats.
5. Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>(10);


    public Cat() {
        String name = "vasea";
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            cats.add(i, new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < Cat.cats.size(); i++) {
            System.out.println(cats.get(i));

        }
    }
}
