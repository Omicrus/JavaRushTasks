package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
1. Программа должна считать имя файла с консоли.
2. Создай для файла поток для чтения.
todo 3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
4. Поток для чтения из файла должен быть закрыт.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine()); //todo change the name of pathfile
        reader.close();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String id = args[0];
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith(String.valueOf(id) + " ")) {
                System.out.println(line);
            }
        }
                fileInputStream.close();
    }
}
