package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable,Runnable {
   transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();

    }

    public void run() {
        // do something here, doesn't matter what
        System.out.println("this person run with " + speed + " km");
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Thread th = new Thread(this);
        th.start();

    }

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        Solution saveSolution = new Solution(105);

        System.out.println(saveSolution.speed);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        oos.writeObject(saveSolution);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        Solution loadSolution = (Solution) ois.readObject();

        System.out.println( loadSolution.speed);


      /*
        4. В методе readObject должен быть создан новый объект типа Thread с текущим объектом в качестве параметра.
        5. В методе readObject должен быть вызван метод start у нового объекта типа Thread.*/


    }
}
