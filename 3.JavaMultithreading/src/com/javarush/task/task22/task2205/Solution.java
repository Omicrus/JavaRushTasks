package com.javarush.task.task22.task2205;

/*
Должен быть вывод:
МНЕ нравится курс JavaRush
Требования:

4. Метод getFormattedString должен возвращать строку с параметрами для форматирования согласно условию задачи.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }
    public static String getFormattedString() {
        return "%3$S %4$s %2$s %1$s";
    }
}
