package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.

Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a = Math.pow((double)(x2-x1),2) + Math.pow((double)(y2 - y1),2);

        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(3,2,7,8));


    }
}
