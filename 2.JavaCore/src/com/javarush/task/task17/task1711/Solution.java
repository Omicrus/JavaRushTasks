package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        SimpleDateFormat simpleDF = new SimpleDateFormat("dd/MM/yyyy");

//                       |        |        |
        /*int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 2; i < x.length; i += 3) {
            System.out.println(x[i]);
        }*/

        switch (args[0]) {
            //-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
            case "-c":
                //-c name1 sex1 bd1 name2 sex2 bd2 name3 sex3 bd3   (10-1)/3
                // 0   1    2    3   4     5    6    7    8    9
                synchronized (allPeople) {
                    for (int i = 2; i < args.length; i += 3) {
                        if (args[i].equals("м"))
                            allPeople.add(Person.createMale(args[i - 1], simpleDF.parse(args[i + 1])));
                        else {
                            allPeople.add(Person.createFemale(args[i - 1], simpleDF.parse(args[i + 1])));
                        }
                        System.out.println(allPeople.size() - 1);
                    }

                }
                break;

            case "-u":
                //-u - обновляет соответствующие данные людей с заданными id
                //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
                synchronized (allPeople) {
                    for (int i = 3; i < args.length; i += 4) {
                        if (args[i].equals("м")) {
                            allPeople.set(Integer.valueOf(args[i-2]), Person.createMale(args[i-1], simpleDF.parse(args[i+1])));
                        } else {
                            allPeople.set(Integer.valueOf(args[i-2]), Person.createFemale(args[i-1], simpleDF.parse(args[i+1])));
                        }
                    }
                }
                break;
            case "-d":
                //-d - производит логическое удаление человека с id, заменяет все его данные на null
                //-d id1 id2 id3 id4 ...
                for (int i = 1; i <args.length ; i++) {
                    synchronized (allPeople) {
                        allPeople.get(Integer.valueOf(args[i])).setName(null);
                        allPeople.get(Integer.valueOf(args[i])).setSex(null);
                        allPeople.get(Integer.valueOf(args[i])).setBirthDay(null);
                    }
                }

                break;
            case "-i":
                //-i - выводит на экран информацию о всех людях с заданными id: name sex bd
                //Миронов м 15-Apr-1990
                //Миронова ж 25-Apr-1997
                //-i id1 id2 id3 id4 ...
                SimpleDateFormat SPD = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    for (int i = 1; i < args.length; i++) {
                        synchronized (allPeople) {
                            int x = Integer.valueOf(args[i]);
                        if (allPeople.get(x).getSex().equals(Sex.MALE)) {
                            System.out.println(allPeople.get(x).getName() + " м " + SPD.format(allPeople.get(x).getBirthDay()));
                        } else {
                            System.out.println(allPeople.get(x).getName() + " ж " + SPD.format(allPeople.get(x).getBirthDay()));
                        }
                    }
                }
                break;
        }

    }
}
