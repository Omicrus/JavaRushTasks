package com.javarush.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Исключения. Просто исключения.
Метод main должен вызывать метод method1.
2. Метод main должен перехватывать исключение NullPointerException.
3. Метод main должен перехватывать исключение FileNotFoundException.
4. Метод main не должен перехватывать исключение ArithmeticException.
5. Метод main не должен перехватывать исключение URISyntaxException.
6. Метод method1 не изменять.
*/

public class Solution {
    public static void main(String[] args) throws  Exception {
        //напишите тут ваш код


        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }

        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
