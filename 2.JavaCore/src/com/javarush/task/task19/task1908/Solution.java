package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader bfr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (bfr.ready()) {
            String[] words = bfr.readLine().split(" ");
            for (String s : words) {
                if (s.matches("\\d*"))
                    bfw.write(s + " ");
            }
        }

        bfr.close();
        bfw.close();

    }
}
