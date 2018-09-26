package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
       // Collections.addAll(words, "aaaa", "bbb", "aaaa", "cccc", "bbbb", "cccc", "aaaa", "bbb", "aaaa", "cccc", "bbbb", "cccc");
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
                                                       // [0]     [1]    [2]     [3]     [4]     [5]     [6]     [7]    [8]     [9]     [10]    [11]
        //напишите тут ваш код Collections.addAll(words, "aaaa", "bbb", "aaaa", "cccc", "bbbb", "cccc", "aaaa", "bbb", "aaaa", "cccc", "bbbb", "cccc");

        for (String sl : list){
            result.merge(sl, 1, Integer::sum);
        }



        /*list.forEach(word ->
                result.merge(word, 1, (v, newV) -> v + newV)
        );*/


        return result;
    }

}

