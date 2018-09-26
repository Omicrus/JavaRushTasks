package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        return n;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(reader.readLine());
        return d;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код boolean readBoolean() - читает с клавиатуры строку "true" или "false"
        // и возвращает соответствующую логическую переменную true или false

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean b = Boolean.parseBoolean(reader.readLine());
        return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(readBoolean());
    }
}
