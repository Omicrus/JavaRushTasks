package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
4. Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());

    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int m = stackTraceElements[2].getLineNumber();
        return  m;
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int m = stackTraceElements[2].getLineNumber();
        return  m;
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int m = stackTraceElements[2].getLineNumber();
        return  m;
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int m = stackTraceElements[2].getLineNumber();
        return  m;
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getLineNumber();
    }
}
