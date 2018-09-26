package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
 Программа должна считывать c консоли имя файла.
 Создай и используй объект типа BufferedWriter.
 Программа не должна ничего читать из файловой системы.
 Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
        String s = bufferedReader.readLine();

        while (!s.equals("exit")) {

           // System.out.println(s);
            bufferedWriter.write(s);
            bufferedWriter.write(System.getProperty("line.separator"));
            bufferedWriter.flush();
            s = bufferedReader.readLine();

        }
        bufferedWriter.write(s);
        bufferedReader.close();
        bufferedWriter.close();


       /*
       OutputStream outputStream = new FileOutputStream("C:\\Users\\Omen\\Desktop\\File1.txt");
       String s = bufferedReader.readLine();

        while (!s.equals("exit")) {

            outputStream.write(s.getBytes());
            outputStream.write(System.getProperty("line.separator").getBytes());

            System.out.println(s);
            s = bufferedReader.readLine();
        }
        outputStream.write(s.getBytes());
        outputStream.write(System.getProperty("line.separator").getBytes());
        outputStream.close();
        bufferedReader.close();*/
    }
}
