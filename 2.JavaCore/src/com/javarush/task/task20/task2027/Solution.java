package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        // detectAllWords(crossword, "home", "same");
        List<Word> list = detectAllWords(crossword, "same");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        List<Word> list = new ArrayList<>();

        for (String w : words) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] letters = w.toCharArray();
            int lenghtWord = w.length();
            int k = 0;
            Word word;
            Point pStart = new Point();
            Point pEnd = new Point();


            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {

                    for (; k < letters.length; ) {

                        if (letters[k] == crossword[i][j]) {
                            stringBuilder.append(letters[k]);
                            k++;
                            lenghtWord--;

                            if (letters[0] == crossword[i][j]) {
                                pStart = new Point(i, j);
                            }
                            if (letters[letters.length - 1] == crossword[i][j]) {
                                pEnd = new Point(i, j);
                            }
                            if (lenghtWord == 0) {
                                word = new Word(stringBuilder.toString());
                                word.setStartPoint(pStart.getX(), pStart.getY());
                                word.setEndPoint(pEnd.getX(), pEnd.getY());
                                stringBuilder = new StringBuilder();
                                lenghtWord = w.length();
                                list.add(word);
                                k = 0;
                            }
                            break;
                        } else {
                            k = 0;
                            lenghtWord = w.length();
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }

    public static class Point {
        private int x;
        private int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
