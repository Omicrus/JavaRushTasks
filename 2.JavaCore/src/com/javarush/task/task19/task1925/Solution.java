package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
         String file1 = args[0];
         String file2 = args[1];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready()) {
            String[] line = bufferedReader.readLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {

                if (line[i].length() > 6) {
                    stringBuilder.append(line[i]).append(",");
                }
            }
        }
       // System.out.println(stringBuilder.toString());
        bufferedWriter.write(stringBuilder.substring(0, stringBuilder.length() - 1));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
