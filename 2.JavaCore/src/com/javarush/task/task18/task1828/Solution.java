package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
       /* args = new String[5];
        args[0] = "-d";
        args[1] = "4";
        args[2] = "schibat pe o linie noua";
        args[3] = "254.56";
        args[4] = "32.5";*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        writeToFile(fileName, args);
        reader.close();
    }

    public static void writeToFile(String fileName, String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }
        switch (args[0]) {
            case "-u": {
                changeDataInFile(fileName, args);
                break;
            }
            case "-d": {
                deleteLineFromFile(fileName, args);
                break;
            }
        }
    }

    public static void changeDataInFile(String fileName, String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName, true));
        StringBuilder s1 = new StringBuilder();
        for (int i = 2; i < args.length - 2; i++) {
            s1.append(args[i]).append(" ");
        }
        String s;
        List<String> list = new ArrayList<>();
        while ((s = reader.readLine()) != null) {
            int m = Integer.parseInt(s.substring(0, 8).trim());
            if (m == Integer.parseInt(args[1])) {
                list.add(String.format("%-8.8s%-30.30s%-8.8s%-4.4s", m, s1, args[args.length - 2], args[args.length - 1]));
            } else {
                list.add(s);
            }
        }
        reader.close();
        FileOutputStream writer = new FileOutputStream(fileName);
        writer.close();
        for (String s2 : list) {
            outStream.write(s2 + System.lineSeparator());
        }
        outStream.close();
    }

    public static void deleteLineFromFile(String fileName, String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName, true));
        String s;
        List<String> list = new ArrayList<>();
        while ((s = reader.readLine()) != null) {
            int m = Integer.parseInt(s.substring(0, 8).trim());
            if (m == Integer.parseInt(args[1])) continue;
            list.add(s);
        }
        reader.close();


        FileOutputStream writer = new FileOutputStream(fileName);
        writer.close();
        for (String s2 : list) {
            outStream.write(s2 + System.lineSeparator());
        }
        outStream.close();
    }
}