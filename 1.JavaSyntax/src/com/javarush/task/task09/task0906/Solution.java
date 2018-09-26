package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StringBuilder messages = new StringBuilder();
        messages.append(Thread.currentThread().getStackTrace()[2].getClassName()).
                append(": ").
                append(Thread.currentThread().getStackTrace()[2].getMethodName()).
                append(": ").
                append(s);

        System.out.println(messages);

    }
}
