package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());//0
        threads.add(new Thread2());//1
        threads.add(new Thread3());//2
        threads.add(new Thread4());//3
        threads.add(new Thread5());//4
    }

    public static void main(String[] args) throws InterruptedException {

       /* threads.get(0).start();
        threads.get(1).start();
        threads.get(1).interrupt();
        threads.get(2).start();*/
        threads.get(3).start();
        Thread4 thread4 = (Thread4) threads.get(3);
        thread4.showWarning();

      /*  Thread4 thread4 = new Thread4();
        thread4.showWarning();*/
      /*  threads.get(4).start();*/


    }


    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {

            while (!isInterrupted()) {

            }
        }
    }

    public static class Thread5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        boolean enter = false;

        @Override
        public void run() {


            try {
                while (!enter) {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(number);
                        enter = true;
                    } else number += Integer.parseInt(s);
                }
            } catch (IOException e) {

            }


        }
    }

}
