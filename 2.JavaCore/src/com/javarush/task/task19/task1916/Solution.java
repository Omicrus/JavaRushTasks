package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        ArrayList<String> text1 = new ArrayList<>();
        ArrayList<String> text2 = new ArrayList<>();

        while (file1.ready()) {
            text1.add(file1.readLine());
        }
        while (file2.ready()) {
            text2.add(file2.readLine());
        }
        file1.close();
        file2.close();

        while (text1.size() > 0 || text2.size() > 0) {
            if (text1.size() > 0 && text2.size() == 0) {
                lines.add(new LineItem(Type.REMOVED, text1.get(0)));
                text1.remove(0);
            } else if (text2.size() > 0 && text1.size() == 0) {
                lines.add(new LineItem(Type.ADDED, text2.get(0)));
                text2.remove(0);
            } else if (text1.get(0).equals(text2.get(0))) {
                lines.add(new LineItem(Type.SAME, text1.get(0)));
                text1.remove(0);
                text2.remove(0);
            } else if (text1.get(1).equals(text2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, text1.get(0)));
                text1.remove(0);
            } else if (text1.get(0).equals(text2.get(1))) {
                lines.add(new LineItem(Type.ADDED, text2.get(0)));
                text2.remove(0);
            }

     //       System.out.println(lines.get(lines.size() - 1).type + " " + lines.get(lines.size() - 1).line);
        }
        System.out.println("");
        for (LineItem item : lines) {
            System.out.println(item.type + " " + item.line);
        }
     //   System.out.println(text1.size() + " " + text2.size());
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
