package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }
        int max = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int count = 0;
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    if (max < count) max = count;
                }else break;
            }
        }
        System.out.println(max);
    }
}