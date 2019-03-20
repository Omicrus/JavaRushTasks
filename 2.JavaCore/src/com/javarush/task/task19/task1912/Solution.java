package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;

        ByteArrayOutputStream temp = new ByteArrayOutputStream();
        PrintStream test = new PrintStream(temp);
        System.setOut(test);
        testString.printSomething();

        String text = temp.toString().replace("te", "??");

        System.setOut(console);
        System.out.println(text);




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
