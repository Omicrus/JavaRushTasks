package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            try {
                if (s.contains("."))
                print(Double.valueOf(s));
                else throw new NumberFormatException();
            } catch (NumberFormatException e4) {
                try {
                    //2.2. больше нуля, но меньше 128, то вызвать метод print для short;
                    if (Short.valueOf(s) > 0 && Short.valueOf(s) < 128) {
                        print(Short.valueOf(s));
                    } else throw new NumberFormatException();

                } catch (NumberFormatException e1) {
                    try {
                        //2.3 меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
                        if (Integer.valueOf(s) <= 0 || Integer.valueOf(s) >= 128)
                            print(Integer.valueOf(s));
                        else throw new NumberFormatException();
                    } catch (NumberFormatException e2) {
                        print(s);
                    }
                }
            }
            //continue ciclul
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
