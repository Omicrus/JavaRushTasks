package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Знакомство с графами
Прочитать в дополнительных материалах о сериализации графов.
Дан ориентированный плоский граф Solution, содержащий циклы и петли.
Пример, http://edu.nstu.ru/courses/saod/images/graph1.gif
Сериализовать Solution.
Все данные должны сохранить порядок следования.
Требования:
1. В классе Solution должно существовать поле edges.
2. В классе Solution должно существовать поле node.
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Solution solution = new Solution();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));

        oos.writeObject(solution);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        Solution solution1NewOne = (Solution) ois.readObject();

        System.out.println(solution1NewOne.node);
        System.out.println(Arrays.asList(solution1NewOne.edges));
        ois.close();


    }
}
