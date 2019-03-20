package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    transient private final String pattern = "dd MMMM yyyy, EEEE";
    String string;
    transient private Date currentDate;
    transient private int temperature;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       /* Написать код проверки самостоятельно в методе main:
        1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
        2) создать экземпляр класса Solution - savedObject;
        3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
        4) создать другой экземпляр класса Solution с другим параметром;
        5) загрузить из потока на чтение объект - loadedObject;
        6) проверить, что savedObject.string равна loadedObject.string;
        7) обработать исключения.*/


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        Solution solution = new Solution(20);
        oos.writeObject(solution);
        System.out.println(solution);

        Solution solution1 = new Solution(10);
        solution1 = (Solution) ois.readObject();
        System.out.println(solution1);

        System.out.println(solution.string.equals(solution1.string));

        System.out.println(solution.temperature);
        System.out.println(solution1.temperature);
        ois.close();
        oos.close();

    }

    @Override
    public String toString() {
        return this.string;
    }
}
