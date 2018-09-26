package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //add your code here - добавьте код тут
    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String name;
        private ArrayList<String> list = new ArrayList<>();


        @Override
        public void setFileName(String fullFileName) {
            this.name = fullFileName;
        }

        @Override
        public String getFileContent() {
            String text = "";
            for (String c : list) {
                text += c + " ";
            }
            return text;
        }

        @Override
        public void run() {
            try {
                FileInputStream fil = new FileInputStream(this.name);
                BufferedReader br = new BufferedReader(new InputStreamReader(fil));
                String line = "";


                while ((line = br.readLine()) != null) {
                    list.add(line);
                }

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
