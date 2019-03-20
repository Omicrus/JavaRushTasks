package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bfr = new BufferedReader(new FileReader(args[0]));
        String pattern = "dd MM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        while (bfr.ready()) {
            String line = bfr.readLine();
            System.out.println(line);
            String[] mass = line.trim().split("\\s+");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < mass.length - 3; i++) {
                stringBuilder.append(mass[i]).append(" ");
            }
            Date data = simpleDateFormat.parse(mass[mass.length - 3] + " " + mass[mass.length - 2] + " " + mass[mass.length - 1]);
            PEOPLE.add(new Person(stringBuilder.substring(0,stringBuilder.length()-1), data));
        }

        bfr.close();

    }
}
