package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String spam = "JavaRush - курсы Java онлайн";

        /*String[] test = outputStream.toString().split("\n");
        int sciotcik = 0;
        for (String s : test) {
            System.out.println(s);
            sciotcik++;
            if (sciotcik % 2 == 0){
                System.out.println(spam);
            }
        }*/

        byte[] text = outputStream.toByteArray();
        int count = 0;
        for (byte b : text) {
            if (b == 10) {
                count++;
            }
            if (count == 2) {
                System.out.println("\n" + spam);
                count = 0;
            } else {
                System.out.print((char) b);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
