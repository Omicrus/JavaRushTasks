package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human children1 = new Human("Child 1", true, 10);
        Human children2 = new Human("Child 2", false, 5);
        Human children3 = new Human("Child 3", false, 2);
        ArrayList<Human> childrens = new ArrayList<>();
        Collections.addAll(childrens, children1, children2, children3);
        for (Human s : childrens) {
            System.out.println(s);
        }

        Human father = new Human("Father", true, 50, childrens);
        Human mother = new Human("Mother", false, 45, childrens);



        System.out.println(father);
        System.out.println(mother);
        ArrayList<Human> fathers = new ArrayList<>();
        fathers.add(father);

        Human grandFather1 = new Human("GrandFatherSon", true, 85, fathers);
        Human grandMother1 = new Human("GrandMomSon", false, 85, fathers);
        System.out.println(grandFather1);
        System.out.println(grandMother1);
        ArrayList<Human> mothers = new ArrayList<>();
        mothers.add(mother);

        Human grandFather2 = new Human("GrandFatherDaughter", true, 85, mothers);
        Human grandMother2 = new Human("GrandMomDaughter", false, 85, mothers);
        System.out.println(grandFather2);
        System.out.println(grandMother2);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;

        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
