package com.javarush.task.task09.task0923;

/*
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    //  public static char[] consonants = new char[]{'М','б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', '.'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String stroka = new BufferedReader(new InputStreamReader(System.in)).readLine();
        char[] charS = stroka.toCharArray();

        ArrayList<Character> arrayOfVowels = new ArrayList<>();
        ArrayList<Character> arrayOfConsonants = new ArrayList<>();
        for (char s : charS) {
            if (isVowel(s)) {
                arrayOfVowels.add(s);
            } else if (!isVowel(s)&& !(s == ' ')) {
                arrayOfConsonants.add(s);
            }
        }

        for (char v : arrayOfVowels) {
            System.out.print(v + " ");
        }
        System.out.println("");
        for (char c : arrayOfConsonants) {
            System.out.print(c + " ");
        }

    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }


}