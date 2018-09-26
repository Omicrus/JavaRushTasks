package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Introduce cifre");

        }
       /* if (a <= 0) throw new Exception();
        if (b <= 0) throw new Exception();
        System.out.println(gcd_1(a,b));*/


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        //   System.out.println(a);
        //   System.out.println(b);

        if (a <= 0) throw new Exception();
        if (b <= 0) throw new Exception();
        //   System.out.println("numarul 1 este: " + a);
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) list.add(i);
        }
        //     System.out.println("numarul 2 este: " + b + "\n");
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) list2.add(i);
        }
        //  System.out.println(list);
        //  System.out.println(list2 + "\n");

        for (Integer aList : list) {
            for (Integer aList2 : list2) {
                int m = aList;
                int n = aList2;
                if (m == n) list3.add(m);
            }
        }
        System.out.println(list3.get(list3.size() - 1));
    }
   /* public static int gcd_1(int a, int b) {
        if (b == 0)
            return a;
   //     System.out.println(gcd_1(b, a % b));
        return gcd_1(b, a % b);
    }*/
}
