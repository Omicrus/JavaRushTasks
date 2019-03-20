package com.javarush.task.task20.task2018;

import java.io.*;

/* 
Найти ошибки
*/
public class Solution implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);
        oos.close();

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
        ois.close();
    }

    public static class A {

        protected String nameA = "A";

        public A() {
        }

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }


        private void writeObject(ObjectOutputStream object) throws IOException {
            object.defaultWriteObject();
            object.writeObject(this.nameA);
            object.writeObject(this.nameB);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            nameA = (String) objectInputStream.readObject();
            nameB = (String) objectInputStream.readObject();
            //objectInputStream.close();
        }
    }
}
