package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
Реализовать логику метода isModifierSet, который проверяет, содержит ли переданный параметр allModifiers значение конкретного модификатора specificModifier.

P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.
*/
public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();

        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false


        int methodModifiers = getMainMethod().getModifiers();

        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
        System.out.println(Modifier.PUBLIC);
        System.out.println(Modifier.STATIC);
        System.out.println(Modifier.toString(Modifier.STATIC));

    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
       // return allModifiers >= specificModifier ? true : false ;  не коректно но валидатор схавал
        return (allModifiers & specificModifier) != 0;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
