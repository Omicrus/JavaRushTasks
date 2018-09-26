package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {
       /* Clothes clothes = new Clothes();
        clothes.getAllowedAction("Name");
        clothes.isMovable();
        clothes.getAllowedAction();*/
    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Clothes getAllowedAction(String name) {
            return new Clothes();
        }

        @Override
        public Object getAllowedAction() {
            return new Clothes();
        }
    }
}
