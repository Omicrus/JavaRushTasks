package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
          FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
       // FileInputStream inputStream = new FileInputStream("data.txt");

        byte[] buffer = new byte[inputStream.available()];
        //System.out.println("длина буффера: " + buffer.length);

        while (inputStream.available() > 0) {
            inputStream.read(buffer);
           /* for (byte b : buffer) {
                System.out.print(b + " ");
            }*/
        }
        int m = buffer.length / 2; // = 3
        if (buffer.length % 2 == 0) {
            outputStream1.write(buffer, 0, (buffer.length / 2));
            outputStream2.write(buffer, (buffer.length / 2), (buffer.length) - buffer.length / 2);
        } else {

            outputStream1.write(buffer, 0, (int) ((buffer.length / 2) + 1.5));
            outputStream2.write(buffer, (int) ((buffer.length / 2) + 1.5), (buffer.length) - (int) (buffer.length / 2 + 1.5));
        }


        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
