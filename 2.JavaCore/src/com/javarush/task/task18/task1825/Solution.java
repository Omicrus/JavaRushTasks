package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем файл
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        ArrayList<String> list = new ArrayList<>();
        while (!(file = reader.readLine()).equals("end")) {
            list.add(file);
        }
        reader.close();

     //   System.out.println(list);
        Collections.sort(list);

      //     System.out.println(list);

        FileOutputStream fileOutputStream = new FileOutputStream(list.get(0).substring(0,list.get(0).lastIndexOf(".part")), true);

        for (String s : list) {
            FileInputStream fileInputStream = new FileInputStream(s);

            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available() > 0) {
                fileInputStream.read(buffer);
                fileOutputStream.write(buffer);
            }
            fileInputStream.close();

        }fileOutputStream.close();



    }
}
