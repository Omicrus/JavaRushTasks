package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() {
        x = 0.0;
        y = 0.0;
        radius = 0.0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public Circle(Circle cir) {
        this(cir.x, cir.y, cir.radius);
    }


    public static void main(String[] args) {

    }
}