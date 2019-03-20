package com.javarush.task.task20.task2002;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws Exception {

        double i = 88_55;
        System.out.println(i);
        Cat cat = new Cat("lena",10,25);
        PrintWriter printWriter = new PrintWriter("data.txt");
        cat.save(printWriter);
        printWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));

        cat.load(bufferedReader);
        System.out.println(cat.name);

        bufferedReader.close();

    }


    public static class Cat{
        String name;
        int age;
        int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public void save(PrintWriter printWriter) throws Exception{
            printWriter.println(name);
            printWriter.println(age);
            printWriter.println(weight);
            printWriter.flush();
        }
        public void load(BufferedReader bufferedReader) throws Exception{
            name = bufferedReader.readLine();
            age = Integer.parseInt(bufferedReader.readLine());
            weight = Integer.parseInt(bufferedReader.readLine());

        }

    }
}

