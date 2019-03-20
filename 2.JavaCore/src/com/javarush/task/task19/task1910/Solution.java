package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bfr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (bfr.ready()){
            bfw.write(bfr.readLine().replaceAll("\\p{Punct}",""));
        }

            bfr.close();
        bfw.close();

    }
}
