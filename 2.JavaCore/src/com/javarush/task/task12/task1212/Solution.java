package com.javarush.task.task12.task1212;

/* 
«Исправь код», часть 1
*/

public class Solution {
    public static void main(String[] args) {
        Pet petik = new Cat();
        System.out.println(petik.getName());
        petik.setLa();
        System.out.println(petik.getChild());

        Cat catik = new Cat();
        System.out.println(catik.getName());


    }

    public abstract static class Pet {
        public String getName() {
            return "Я - zveri";
        }

public void setLa(){
    System.out.println("tralala");
}
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "ea kot ea ne zveri";
        }

        @Override
        public Cat getChild() {
            return new Cat();
        }
        
    }
}
