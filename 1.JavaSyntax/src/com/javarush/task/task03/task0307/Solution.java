package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    /**
     * create object in starcraft
     *
     * @param args start program
     */
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg[] zergs = new Zerg[10];
        Protoss[] protosses = new Protoss[5];
        Terran[] terrans = new Terran[12];

        for (int i = 0; i < 12; i++) {
            if (i < zergs.length) {
                zergs[i] = new Zerg();
                zergs[i].name = "zergon" + i;
                System.out.println(zergs[i].name);
            }
            if (i < protosses.length) {
                protosses[i] = new Protoss();
                protosses[i].name = "prot" + i;
                System.out.println(protosses[i].name);
            }
            if (i < terrans.length) {
                terrans[i] = new Terran();
                terrans[i].name = "terros" + i;
                System.out.println(terrans[i].name);
            }
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
