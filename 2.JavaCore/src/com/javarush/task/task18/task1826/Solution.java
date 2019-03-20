package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        switch (args[0]) { // TODO: 07-Feb-19 change condition in args[0]
            case "-e": {
                fileInputStream = new FileInputStream(args[1]);
                fileOutputStream = new FileOutputStream(args[2]);
                byte[] buff = new byte[fileInputStream.available()];

                while (fileInputStream.available() > 0)
                    fileInputStream.read(buff);
                for (int i = 0; i < buff.length; i++) {
                    fileOutputStream.write(buff[i] + 1);
                }
                fileInputStream.close();
                fileOutputStream.close();
                break;
            }
            case "-d": {
                fileInputStream = new FileInputStream(args[1]);
                fileOutputStream = new FileOutputStream(args[2]);
                byte[] buff = new byte[fileInputStream.available()];

                while (fileInputStream.available() > 0)
                    fileInputStream.read(buff);
                for (int i = 0; i < buff.length; i++) {
                    fileOutputStream.write(buff[i] - 1);
                }

                fileInputStream.close();
                fileOutputStream.close();
                break;
            }
        }

    }

}
