package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 2, (Integer) null);
        printMatrix((Integer) 2, 2, null);
        printMatrix((Integer) 2, (Integer) 2, null);
        printMatrix(2, 3, "8");
        printMatrix(3, 3, 's');
        printMatrix((short) 2, (short) 2, "I");
        printMatrix((short) 2, 2, "O");
        printMatrix((short) 1, (Integer) 2, "sI");
        printMatrix("null", "R" , "v");
        printMatrix((byte)2,(Integer)3, "m");


    }

    public static void printMatrix(int m, int n, Integer i) {
        printMatrix(m, n, (Object) i);

    }

    public static void printMatrix(Integer m, int n, String value) {
        System.out.println("Заполняем объектами String и Интежером");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, int n, String value) {
        System.out.println("Заполняем объектами String и Интежером");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, Integer n, String value) {
        System.out.println("Заполняем объектами String и Интежером");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(byte m, Integer n, String value) {
        System.out.println("Заполняем объектами String и Интежером");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("Заполняем объектами String и Интежером  и все будет нулл");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(short m, short n, String value) {
        System.out.println("Заполняем объектами String и Short  и все будет 1");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(String m, String n, String value) {
        System.out.println("Заполняем объектами String " + m + n + value);

    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
