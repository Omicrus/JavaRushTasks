package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine()); // read from file

       /* int data = inputStream.read();
        char content;
        while (data != -1) {
            content = (char) data;
            System.out.print(content);
            data = inputStream.read();
        }*/
       while (inputStream.available() > 0){
           System.out.print((char)inputStream.read());
       }



        inputStream.close();
        reader.close();
    }


}