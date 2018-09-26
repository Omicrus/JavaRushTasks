package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

       /* 5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
        5.1. С консоли считай один параметр типа String.
        5.2. Если параметр равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet
        thePlanet, иначе обнулить Planet thePlanet.
        */// implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (s.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (s.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else thePlanet = null;

        reader.close();
    }
}
