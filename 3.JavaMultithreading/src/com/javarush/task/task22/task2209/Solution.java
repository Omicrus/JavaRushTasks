package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine()), "UTF-8"))) {
            StringBuilder str = new StringBuilder();
            while (reader.ready()) {
                str.append(reader.readLine()).append(" ");
            }
            String[] tmp = str.toString().split(" ");
            StringBuilder result = getLine(tmp);
            System.out.println(result.toString());
        }
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder str = new StringBuilder();
        try {
            ArrayList<String> fullList = new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                str.append(words[i]);
                for (String x : words) {
                    list.add(x);
                }
                list.remove(i);

                while (true) {
                    String s1;
                    if (!(s1 = getId(Character.toLowerCase(str.charAt(str.length() - 1)), list)).isEmpty()) {
                        str.append(" " + s1);
                    } else {
                        break;
                    }
                }
                fullList.add(str.toString().trim());
                str.delete(0, str.length());
                list.clear();
            }

            int len = 0;
            int id = 0;
            for (int s = 0; s < fullList.size(); s++) {
                if (fullList.get(s).length() > len) {
                    len = fullList.get(s).length();
                    id = s;
                }
            }
            str.append(fullList.get(id));
        } catch (Exception e) {
        }
        return str;
    }

    public static String getId(int id, ArrayList ist) {
        ArrayList<String> list = ist;
        String tmp = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toLowerCase().charAt(0) == id) {
                tmp = list.get(i);
                list.remove(i);
                break;
            }
        }
        return tmp;
    }
}