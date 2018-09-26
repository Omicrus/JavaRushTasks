package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
*/

public class Solution {

    private static final List<String> notes = new ArrayList<>();

    public static void main(String[] args) {

        ThreadNote thread1 = new ThreadNote();
        ThreadNote thread2 = new ThreadNote();


        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(notes);


    }

    public static synchronized void addNote(int index, String note) {

        for (int i = 0; i <100 ; i++) {
            notes.add(index + i, note);
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        }
    }

    public static class ThreadNote extends Thread {
        @Override
        public void  run() {
                addNote(0, getName());
        }
    }


}
