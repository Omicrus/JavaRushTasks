package com.javarush.task.task21.task2113;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;


    public Hippodrome(List<Horse> horses1) {
        horses = new ArrayList<>();
        this.horses = horses1;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Emma", 3, 0);
        Horse horse2 = new Horse("Tanea", 3, 0);
        Horse horse3 = new Horse("Borea", 3, 0);
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);
        game.run();
        game.printWinner();


    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(800);
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print() {
      /*  for (int i = 0; i < 10; i++) {
            System.out.println();
        }*/
        for (Horse horse : getHorses()) {
            horse.print();
        }

    }

    public Horse getWinner() {

        Horse horse = null;
        double maximum = 0;
        for (Horse hors : horses) {
            if (hors.getDistance() > maximum) {
                maximum = hors.getDistance();
            }
        }
        for (Horse hors : horses) {
            if (maximum == hors.getDistance()) {
                horse = hors;
            }
        }
        return horse;
    }

    public void printWinner() {
        System.out.format("Winner is %s!", getWinner().getName());
    }


}
