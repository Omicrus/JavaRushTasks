package com.javarush.task.task08.task0829;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<>();
        List<String> families = new ArrayList<>();
        while (true) {
            String address = reader.readLine();
            if (address.isEmpty()) break;

           else {
               addresses.add(address);
                //list of family
                String family = reader.readLine();
                if (family.isEmpty()) {
                    family = reader.readLine();
                }
                families.add(family);
        }}

                //read home addresses
        String addressOfFamily = reader.readLine();

        if (addresses.contains(addressOfFamily)) {
            System.out.println(families.get(addresses.indexOf(addressOfFamily)));

        }






      /*  //list of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }*/
    }
}
