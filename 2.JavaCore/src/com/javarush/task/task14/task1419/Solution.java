package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchFieldException();
        } catch (NoSuchFieldException e) {
            exceptions.add(e);
        }try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            exceptions.add(e);
        }try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();

        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
