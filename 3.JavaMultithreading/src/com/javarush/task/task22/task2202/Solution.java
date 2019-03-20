package com.javarush.task.task22.task2202;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.

Пример:
"JavaRush - лучший сервис обучения Java."

Результат:
"- лучший сервис обучения"

Пример:
"Амиго и Диего лучшие друзья!"

Результат:
"и Диего лучшие друзья!"

На некорректные данные бросить исключение TooShortStringException (сделать исключением).
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
        System.out.println(getPartOfString(null));

    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        } else {
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(string);
            ArrayList<Integer> count = new ArrayList<>();
            while (matcher.find()) {
                count.add(matcher.start());
            }

            if (count.size() < 4) {
                throw new TooShortStringException();
            }
            if (count.size() == 4) {
                return string.substring(count.get(0)+1);
            } else {
                return string.substring(count.get(0)+1, count.get(4));
            }
        }
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
