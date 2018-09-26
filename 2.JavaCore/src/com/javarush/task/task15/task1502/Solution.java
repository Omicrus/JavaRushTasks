package com.javarush.task.task15.task1502;

/*
ООП - Наследование животных
5. В классах Goose и Dragon переопределить метод String getSize(), расширить видимость до максимальной.
6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].
*/
public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {
        BigAnimal bigAnimal = new BigAnimal();
        System.out.println("Биг анимал  = " + bigAnimal.getSize());
        SmallAnimal smallAnimal = new SmallAnimal();
        System.out.println("Смалл анимал = " + smallAnimal.getSize());

        Goose goose = new Goose();
        System.out.println(goose.getSize());
        Dragon dragon = new Dragon();
        System.out.println(dragon.getSize());

        SmallAnimal smallAnimal1 = new Goose();
        System.out.println(smallAnimal1.getSize());

        BigAnimal bigAnimal1 = new Dragon();
        System.out.println(bigAnimal1.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "Гусь маленький, " + super.getSize();

        }

    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }
}
