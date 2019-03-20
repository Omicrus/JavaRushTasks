package com.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправь ошибки не меняя сигнатуры методов и класса.


Требования:



*/
public class Solution implements Serializable, AutoCloseable {

    transient private FileOutputStream stream;
    private String fileName;


    public Solution(String fileName) throws FileNotFoundException {
        /* 5. В конструкторе класса Solution поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметром(fileName).*/

        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* Написать код проверки самостоятельно в методе main:
        1) создать экземпляр класса Solution
        2) записать в него данные - writeObject
        3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
        4) десериализовать, получаем новый объект
        5) записать в новый объект данные - writeObject
        6) проверить, что в файле есть данные из п.2 и п.5*/
        Solution solution = new Solution("data.txt");
        solution.writeObject("dece nu?");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("copy.txt"));
        oos.writeObject(solution);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("copy.txt"));
        Solution solutionNewOne = (Solution) ois.readObject();
        ois.close();
        solutionNewOne.writeObject("repetare");


    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
       /* 3. В методе readObject(ObjectInputStream in) не должен быть вызван метод close у потока полученного в качестве параметра.
        4. В методе readObject(ObjectInputStream in) поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметрами(fileName, true).*/
       in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);


    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }
}
