package com.javarush.task.task20.task2021;

import java.io.*;

/*
Сериализация под запретом
Запрети сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя.


Требования:
1. Класс Solution должен поддерживать интерфейс Serializable.
2. Класс SubSolution должен быть создан внутри класса Solution.
3. Класс SubSolution должен быть потомком класса Solution.
4. При попытке сериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
5. При попытке десериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
*/
public class Solution implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));

        SubSolution subSolution = new SubSolution();
        oos.writeObject(subSolution);
        oos.close();

        SubSolution subSolution1;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));

        subSolution1 = (SubSolution) ois.readObject();
        ois.close();
        System.out.println(subSolution.equals(subSolution1));


    }

    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
            throw new NotSerializableException();

        }
        private void readObject(ObjectInputStream ois)throws NotSerializableException{
            throw new NotSerializableException();

        }


    }
}
