package com.javarush.task.task17.task1712;

public class Table {
    private static byte tableNumber;            // число созданых обьектов типа табле с доступом статиком
    private byte number = ++tableNumber;        //  автоматически инкрементируется в number число созданых обьектов имея более онбший доступ

    public Order getOrder () {
        return new Order(number);
    }
}
