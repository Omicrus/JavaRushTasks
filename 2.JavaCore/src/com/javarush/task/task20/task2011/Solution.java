package com.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Apartment apartment = new Apartment();
        apartment.address = "via della fiera 23";
        apartment.year = 1985;

        ObjectOutputStream aos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        //  aOS.writeObject(apartment);
        apartment.writeExternal(aos);
        System.out.println(apartment);
        aos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        Apartment apartment1 = new Apartment();
        apartment1.readExternal(ois);
        System.out.println(apartment);

        ois.close();


    }

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);

        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }
    }
}
