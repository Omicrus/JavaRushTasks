package com.javarush.task.task18.task1815;

import java.io.*;
import java.util.List;

/* 
Таблица
Метод getHeaderText должен возвращать текст в верхнем регистре - используйте метод toUpperCase().
*/

public class Solution {
    public static void main(String[] args) {
        // cream o variabila de tip File cu numele (file) in ea salvam adresa unde va fi creat fisierul dorit.
        File file = new File("C:\\Users\\Omen\\Desktop\\testik.txt");
        try {
            PrintStream potokFilePrintStream = new PrintStream(file);

            potokFilePrintStream.println(222);
            potokFilePrintStream.println("mama");
            potokFilePrintStream.println(false);


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        /*try {
        // cream un curent de informatie si il lasam deschis pentru ai arata unde va trebui sa salveze textul nostru
            FileOutputStream fileOutputStream = new FileOutputStream(file,true); // fara TRUE nu se va adauga textul nou la cel vechi
            String greetings = "hello im here and it was a test\r\n";
            fileOutputStream.write(greetings.getBytes()); //introducem in fisier datele din variabila greetings
            fileOutputStream.close();                     //inchidem curentul de informatie
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i;
            // citim byte dupa byte fiecare litera din fisier pina nu va foi ==0
            while (fileInputStream.available() > 1){
                System.out.print((char)fileInputStream.read());
            }*/
               /* while ((i = fileInputStream.read()) != -1) {
                    System.out.print((char) i);
                }*/
           /* fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public class TableInterfaceWrapper implements TableInterface {

        public TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }

        @Override
        //3. Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);

        }

        @Override //4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override //5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);

        }
    }
}