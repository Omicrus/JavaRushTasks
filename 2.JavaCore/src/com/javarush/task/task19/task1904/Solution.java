package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {


        PersonScanner ps = new PersonScannerAdapter(new Scanner(new File("data.txt"), "windows-1251"));
        Person person = ps.read();
        ps.close();
        System.out.println(person.toString());

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {

            fileScanner.useDelimiter("\\s");
            String lastName = fileScanner.next();
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            Date date = null;
            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");


            try {
                date = dateFormat.parse(String.format("%d %d %d", fileScanner.nextInt(), fileScanner.nextInt(), fileScanner.nextInt()));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
