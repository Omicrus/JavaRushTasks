package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Ресторан
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();                  //официант
        Thread waiter = new Thread(waiterTarget);            //нить официант
        threads.add(waiter);                                 //list threads  добавляем нить (официант)

        Cook cookTarget = new Cook();                        // обьект повар
        Thread cook = new Thread(cookTarget);                // нить повара
        threads.add(cook);                                   // list threads добавляем нить(повар)

        waiter.start();                                      // запускаем нить официанта
        cook.start();                                        // запускаем нить повара

        Thread.sleep(2000);                            // нить main спит 2 секунды
        cookTarget.continueWorking = false;                  // мютекс повара переходит на фалсе
        Thread.sleep(500);                             // нить main спит 0,5 секунды
        waiterTarget.continueWorking = false;                // мютекс официанта переходит на фалсе
    }
}
