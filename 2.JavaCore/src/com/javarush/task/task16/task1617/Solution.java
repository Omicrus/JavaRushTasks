package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 2;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (!currentThread().isInterrupted()) {
                try {
                    System.out.print(String.format("%d ", countSeconds--));
                    Thread.sleep(1000);


                    if (countSeconds == 0) {
                        System.out.println("Марш!");
                        return;
                    }

                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;

                }

            }

        }
    }
}

