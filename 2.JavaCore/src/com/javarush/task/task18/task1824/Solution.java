package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        try {
            while (true) {
                file = reader.readLine();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.close();

                } catch (FileNotFoundException e) {
                    System.out.println(file);
                    break;

                }


            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
