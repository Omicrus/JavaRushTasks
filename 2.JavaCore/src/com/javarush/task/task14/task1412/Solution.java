package com.javarush.task.task14.task1412;

/* 
Реализовать метод printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;

        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код
        if (object instanceof Movable){
            ((Movable) object).move();
        }else if (object instanceof Drawable){
            ((Drawable) object).draw();
        }
//        4. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод draw, если этот объект реализует интерфейс Drawable.
//        5. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод move, если этот объект реализует интерфейс Movable.

    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }
    }
}
