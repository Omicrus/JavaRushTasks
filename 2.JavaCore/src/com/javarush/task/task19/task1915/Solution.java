package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        reader.close();

        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream temp = new PrintStream(outputStream);
        System.setOut(temp);
        testString.printSomething();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(outputStream.toByteArray());
        fileOutputStream.close();

        System.setOut(console);
        System.out.println(outputStream.toString());


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

