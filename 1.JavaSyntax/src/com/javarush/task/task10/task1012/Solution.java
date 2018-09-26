package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();

            list.add(s.toLowerCase());
        }

        Map<Character, Integer> count = new LinkedHashMap<>();
        for (Character c : abcArray) {
            count.put(c, 0);
        }

        for (String s : list) {
            for (char c : s.toCharArray()) {
                if (count.containsKey(c)) {
                    int temp = count.get(c);
                    count.replace(c, ++temp);
                }
            }
        }

        for (Map.Entry pairs : count.entrySet())
            System.out.println(pairs.getKey() + " " + pairs.getValue());

        // напишите тут ваш код

        /*ArrayList<Character> listOfCharacterFromStrings = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {     // "милано дом" = size = 10
            char[] temporaryArrayOfChars = list.get(i).toCharArray();
            for (int j = 0; j < temporaryArrayOfChars.length; j++) {
                listOfCharacterFromStrings.add(temporaryArrayOfChars[j]);
            }
        }

        for (Character x : alphabet) {
            int count = 0;
            for (Character listOfCharacterFromString : listOfCharacterFromStrings) {
                if (x.equals(listOfCharacterFromString)) count++;
            }
            System.out.println(x + " " + count);
        }*/
        /*for (Character x : alphabet) {
            int count = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==x) count++;
                }
            }
            System.out.println(x + " " + count);
        }*/

    }

}
