package com.javarush.task.task17.task1702;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Вместе быстрее? Ща проверим :)
*/

public class Solution {
    public static int countThreads = 10;
    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < Solution.testArray.length; i++) {//1000
            testArray[i] = i;// 0 - 999
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer expectedResult = new StringBuffer();
        for (int i = 1000 - 1; i >= 0; i--) {    //999-0
            expectedResult.append(i).append(" ");// in String ExpectedResult add  (999 + " ") from 999 to 0 position, expectResult =  "999 998 997 996" as a string!
        }
Date start = new Date();
        initThreads();  /// start a method that CREATE, START, JOIN start 10 threads of SortThread type!
Date end = new Date();
long delay = end.getTime() - start.getTime();
        System.out.println(delay);


        Date start1 = new Date();
        sort(testArray);
        Date end1 = new Date();
        long delay1 = end1.getTime() - start1.getTime();
        System.out.println(delay1);



        StringBuffer result = new StringBuffer();                // NEW 1 String named result
        for (int i = 0; i < testArray.length; i++) {              //1000
            result.append(testArray[i]).append(" ");  // in String result add  (0 + " ") from 0 to 999 position, result =  "0 1 2 3" as a string!
        }

        System.out.println(result);
        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>(countThreads);
        for (int i = 0; i < countThreads; i++) threads.add(new SortThread());
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
    public static class SortThread extends Thread{
        @Override
        public void run(){
            sort(testArray);
        }
    }
}

