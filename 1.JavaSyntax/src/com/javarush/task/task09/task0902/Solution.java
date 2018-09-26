package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement s : elements) {
            System.out.println(" test:    " + s.getMethodName());
        }
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();

    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
       /* for (StackTraceElement s : elements) {
            System.out.println(" test:    " + s.getMethodName());
        }*/
        return elements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();

    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement s : elements) {
            System.out.println(" test:    " + s.getMethodName());
        }
        return elements[2].getMethodName();

    }
}
