package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
2. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
3. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
4. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
*/


public class Circle {
    //напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;
    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
