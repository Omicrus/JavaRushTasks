package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
Требования:

3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public static void main(String[] args) throws Exception {
        new Solution().fillInPropertiesMap();
        OutputStream outputStream1 = new FileOutputStream("data.txt");
        new Solution().save(outputStream1);
        outputStream1.close();
    }

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        load(fileInputStream);
        fileInputStream.close();


    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        // 4. Метод save должен сохранять "карту properties" в полученный в качестве параметра объект типа OutputStream.
        Properties prop = new Properties();
        for (Map.Entry<String, String> item : properties.entrySet()) {
            prop.setProperty(item.getKey(), item.getValue());
        }
        prop.store(outputStream, "test");

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        //5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.

        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry<Object, Object> item : prop.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
            properties.put(item.getKey().toString(), item.getValue().toString());
        }

    }
}
