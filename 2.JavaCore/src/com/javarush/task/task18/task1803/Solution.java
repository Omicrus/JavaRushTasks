package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
Требования:

3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // trebuie de schimbat calea fisierului prin variabila de mai sus!!!!
        FileInputStream inputStream = new FileInputStream(reader.readLine());// C:\Users\Omen\Desktop\File1.txt      reader.readLine()
        reader.close();
        Map<Integer, Integer> bite = new HashMap<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (bite.containsKey(data)) {
                bite.put(data, 1 + bite.get(data));
            } else bite.put(data, 1);
        }
        inputStream.close();
        int count = 0;
        for (Map.Entry<Integer, Integer> m : bite.entrySet()) {
            if (count < m.getValue()) {
                count = m.getValue();
            }
        }


        for (Map.Entry m : bite.entrySet()) {
            if (m.getValue().equals(count)){
                System.out.print(m.getKey() + " ");
            }
        }



    }
}
