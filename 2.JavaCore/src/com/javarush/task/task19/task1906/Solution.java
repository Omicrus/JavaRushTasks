package com.javarush.task.task19.task1906;

/* 
Четные символы
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(reader1.readLine());
        FileWriter writer = new FileWriter(reader1.readLine());
        reader1.close();

        int x = 0;
        while (reader.ready()) {
            int m = reader.read();
            x++;
            if (x % 2 == 0) {
                writer.write(m);
            }
           /* if (x == 1) {
                writer.write(m);
                x = 0;
            } else {
                x = 1;
            }*/
        }
        reader.close();
        writer.close();
    }
}
