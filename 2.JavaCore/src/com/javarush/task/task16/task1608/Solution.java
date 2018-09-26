package com.javarush.task.task16.task1608;

/* 
Продвижение на политических дебатах
*/



import java.util.Date;

public class Solution {
    public static int totalCountSpeeches = 200;
    public static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");

        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() < totalCountSpeeches) { ////<1000000
         //   ivanov.join();
        }

        Date startTime = new Date();
        ivanov.getCountSpeeches();
        System.out.println(ivanov.getCountSpeeches());

        Date endTime = new Date();
        long msDelay = endTime.getTime() - startTime.getTime();
        System.out.println("Calculates " + msDelay + " ms");

        Date startTime2 = new Date();
        System.out.println(petrov.getCountSpeeches());
       petrov.getCountSpeeches();
        Date endTime2 = new Date();
        long msDelay2 = endTime2.getTime() - startTime2.getTime();
        System.out.println("Calculates " + msDelay2 + " ms");

        Date startTime3 = new Date();
        sidorov.getCountSpeeches();
        System.out.println(sidorov.getCountSpeeches());
        Date endTime3 = new Date();
        long msDelay3 = endTime3.getTime() - startTime3.getTime();
        System.out.println("Calculates " + msDelay3 + " ms");

        System.out.println(ivanov);

        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int countSounds; //???

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (countSounds < totalCountSpeeches * soundsInOneSpeech) { // ??? < 200*1000000
                countSounds++; // increment?????
            }
        }

        public int getCountSpeeches() {
            return countSounds / soundsInOneSpeech; /// ?????/ 1000000
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeeches());
        }
    }
}

