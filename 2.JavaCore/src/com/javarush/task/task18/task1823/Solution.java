package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = reader.readLine()).equals("exit")) {

            new ReadThread(s).start();
        }
        System.out.println(resultMap); //todo delete this line
        reader.close();
    }

    public static class ReadThread extends Thread {
        String name;

        public ReadThread(String fileName) {
            //implement constructor body
            this.name = fileName;


        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(name);


                Map<Integer, Integer> resultFrequency = new HashMap<>();
                int i;
                while ((i = fileInputStream.read()) != -1) {

                    if (resultFrequency.containsKey(i)) {
                        int value = resultFrequency.get(i);
                        resultFrequency.put(i, value + 1);
                    } else {
                        resultFrequency.put(i, 1);
                    }
                }
                int key = Collections.max(resultFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
                //       System.out.println(resultFrequency);//todo delete this line
                //       System.out.println(key);//todo delete this line
                resultMap.put(name, key);
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
