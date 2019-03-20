package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws IOException {
      //  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
      //  reader.close();
        Date dataStart = new Date();
        while (fileReader.ready()){
            String line = fileReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(line);
            System.out.println(stringBuilder.reverse());

        }
        Date dateEnd = new Date();
        long time = (dateEnd.getTime()-dataStart.getTime());
        System.out.println("First method: " + time + " ms");
        fileReader.close();

        fileReader = new BufferedReader(new FileReader("data.txt"));
        Date dataStart1 = new Date();
        while (fileReader.ready()){
            String line = fileReader.readLine();
            char[] array = line.toCharArray();
            for (int i = array.length - 1; i >= 0; i--) {

                System.out.print(array[i]);
            }
            System.out.println();
        }
        Date dateEnd1 = new Date();
        long time1 = (dateEnd1.getTime()-dataStart1.getTime());
        System.out.println("Second method: " + time1 + " ms");
        fileReader.close();

        fileReader = new BufferedReader(new FileReader("data.txt"));
        Date dataStart2 = new Date();
        while (fileReader.ready()){
            String line = fileReader.readLine();
            System.out.println(recursiveReverse(line));
        }
        Date dateEnd2 = new Date();
        long time2 = (dateEnd2.getTime()-dataStart2.getTime());
        System.out.println("Third method: " + time2 + " ms");
        fileReader.close();
    }

    static String recursiveReverse(String s) {
        if ((null == s) || (s.length() <= 1)) {
            return s;
        }
        return recursiveReverse(s.substring(1)) + s.charAt(0);
    }
}
