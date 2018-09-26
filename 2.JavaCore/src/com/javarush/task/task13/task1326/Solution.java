package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        //  InputStream input = new FileInputStream("C:\\Users\\Omen\\Desktop\\File1.txt");
        ArrayList<Integer> arrayList = new ArrayList<>();
        String s;
        while ((s = read.readLine()) != null) {
            if (Integer.parseInt(s) % 2 == 0) {
                arrayList.add(Integer.parseInt(s));
            }
        }
        Collections.sort(arrayList);
        for (Integer n : arrayList) {
            System.out.println(n);
        }
        read.close();
        reader.close();
       /* int c;
        char temp;
        while ((c = inputStreamReader.read()) != -1) {

            temp = (char) c;
            if ((char)c == )
            System.out.println("temp " + temp);
            // arrayList.add(temp);
        }
        System.out.println(arrayList);*/

       /* while (inputStreamReader.available() > 0){
            int data = inputStreamReader.read();
            System.out.println("inputu  "+ data);
            char number  = (char)data;
            System.out.println("numberul  " + number);
            if (number%2 == 0) arrayList.add((int)number);
            System.out.println(arrayList);
        }*/

        /*System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);*/
        //inputStreamReader.close();


    }
}
