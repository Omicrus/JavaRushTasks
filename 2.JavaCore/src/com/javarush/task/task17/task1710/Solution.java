package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
Значения параметров:
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat SDP = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


        /*for (Person list : allPeople) {
            System.out.println(list.getBirthDay());
        }
        System.out.println(SDP.format(allPeople.get(2).getBirthDay()));*/

        switch (args[0]) {
            case "-c":
                // -c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
                // -c Миронов м 15/04/1990
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], simpleDateFormat.parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                } else {
                    allPeople.add(Person.createFemale(args[1], simpleDateFormat.parse(args[3])));
                    System.out.println(allPeople.size() - 1);
                }

                break;
            case "-u":
                // -u - обновляет данные человека с данным id // -u 2 Mihalich m 15/05/2015
                if (args[3].equals("м")) {
                    allPeople.remove(Integer.parseInt(args[1]));
                    allPeople.add(Integer.parseInt(args[1]), Person.createMale(args[2], simpleDateFormat.parse(args[4])));
                } else {
                    allPeople.remove(Integer.parseInt(args[1]));
                    allPeople.add(Integer.parseInt(args[1]), Person.createFemale(args[2], simpleDateFormat.parse(args[4])));
                }
                break;
            case "-d":
                //-d - производит логическое удаление человека с id, заменяет все его данные на null
                //-d 1
                allPeople.get(Integer.valueOf(args[1])).setName(null);
                allPeople.get(Integer.valueOf(args[1])).setSex(null);
                allPeople.get(Integer.valueOf(args[1])).setBirthDay(null);
                break;
            case "-i":
                //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
                // Миронов м 15-Apr-1990
                StringBuilder stringBuilder = new StringBuilder();
                int x = Integer.valueOf(args[1]);
                stringBuilder.append(allPeople.get(x).getName());
                if (allPeople.get(x).getSex().equals(Sex.MALE)) {
                    stringBuilder.append(" м ");
                } else {
                    stringBuilder.append(" ж ");
                }
                stringBuilder.append(SDP.format(allPeople.get(Integer.valueOf(args[1])).getBirthDay()));
                System.out.println(stringBuilder);
                break;
        }

    }
}
