package com.javarush.task.task20.task2017;

import java.io.*;

/* 
Десериализация
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));

        B b = new Solution().new B();
        // A a = new A();
        oos.writeObject(b);
        oos.close();


        FileInputStream fileInputStream = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        A anotherA = new Solution().getOriginalObject(ois);

        ois.close();
        System.out.println(b.equals(anotherA));
        System.out.println(b);
        System.out.println(anotherA);


    }

    public A getOriginalObject(ObjectInputStream objectStream) {

        Object a;
        try {
            a = objectStream.readObject();
        if (a instanceof A){
            return (A)a;
        }else {
            return null;
        }

        } catch (Exception e) {
            System.out.println("error of  De-serealization");
            return null;
        }

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
