package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        writeToFile(fileName, args);
        reader.close();

    }

    public static void writeToFile(String fileName, String args[]) throws Exception {
        if (args.length == 0) {
            return;
        }
        if (args[0].equals("-c")) {
            StringBuilder s1 = new StringBuilder();
            for (int i = 1; i < args.length - 2; i++) {
                s1.append(args[i]).append(" ");
            }
            String productName = s1.toString();


            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream((fileName))));

            int max = 0;
            String s;
            while ((s = reader.readLine()) != null) {
                int m = Integer.parseInt(s.substring(0, 8).trim());
                if (max < m) {
                    max = m;
                }
            }

            BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName, true));

            outStream.write(String.format("\r\n%-8.8s%-30.30s%-8.8s%-4.4s", max + 1, productName, args[args.length - 2], args[args.length - 1]));
            outStream.newLine();

            reader.close();
            outStream.close();
        }
    }
}


