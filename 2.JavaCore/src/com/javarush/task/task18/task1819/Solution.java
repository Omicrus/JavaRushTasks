package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна два раза считать имена файлов с консоли.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        File file1 = new File(reader.readLine());
        reader.close();

        //3. Для первого файла создай поток для чтения и считай его содержимое.
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }
        fileInputStream.close();
        //4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
        //5. Содержимое первого и второго файла нужно объединить в первом файле.
        fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }
        fileOutputStream.write(buffer);

        fileInputStream.close();
        fileOutputStream.close();





    }
}
