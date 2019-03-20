package com.javarush.task.task19.task1911;

/*
Ридер обертка
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consolePrint = System.out;

        ByteArrayOutputStream temp = new ByteArrayOutputStream();

        PrintStream test = new PrintStream(temp);
        System.setOut(test);
        testString.printSomething();
        String upperCase = temp.toString().toUpperCase();
        System.setOut(consolePrint);
        System.out.println(upperCase);





    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
