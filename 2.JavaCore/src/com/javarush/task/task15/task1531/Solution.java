package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.SQLOutput;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        String factor = "";
        if (n < 0) factor = "0";
        if (n == 0) factor = "1";
        if (n <= 150&& n > 0) {
            BigDecimal temp = BigDecimal.ONE;
            for (int i = 1; i <= n; i++) {
                temp = temp.multiply(BigDecimal.valueOf(i));
            }
            factor = String.valueOf(temp);
        }
        return factor;
    }

}
