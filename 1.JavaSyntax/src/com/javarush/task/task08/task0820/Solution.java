package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //System.out.println("pisicile" + cats);

        Set<Dog> dogs = createDogs();
        //  System.out.println("ciinii" + dogs);

        Set<Object> pets = join(cats, dogs);

        printPets(pets);

        removeCats(pets, cats);

        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result2 = new HashSet<>();
        result2.add(new Dog());
        result2.add(new Dog());
        result2.add(new Dog());
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        //   System.out.println(pets);
        HashSet<Object> copy = new HashSet<>(pets);
        for (Object del : copy) {
            for (Cat cat : cats) {
                if (del.equals(cat)) {
                    pets.remove(del);
                }
            }


        }

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object s : pets) {
            System.out.println(s);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}
