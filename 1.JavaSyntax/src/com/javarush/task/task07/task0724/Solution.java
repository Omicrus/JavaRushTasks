package com.javarush.task.task07.task0724;

/* 
Семейная перепись
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Требования:
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1 = new Human("Tolea", true, 62);
        Human grandFather2 = new Human("Ion", true, 65);
        Human grandMother1 = new Human("Tanea", false, 62);
        Human grandMother2 = new Human("Ninaa", false, 61);
        Human father = new Human("Borea", true, 33, grandFather1, grandMother1);
        Human mother = new Human("Ninaa", false, 61, grandFather2, grandMother2);
        Human child1 = new Human("Emma", false, 5, father, mother);
        Human child2 = new Human("Iarik", true, 7, father, mother);
        Human child3 = new Human("Arina", false, 1, father, mother);


        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        // 2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        // 3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        // 4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















