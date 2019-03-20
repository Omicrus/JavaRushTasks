package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // C:\Users\Omen\Desktop\File1.txt

            FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
            FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());


            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream1));
            String line = "";
            while ((line = br.readLine()) != null) {
                allLines.add(line);
            }


            br = new BufferedReader(new InputStreamReader(fileInputStream2));
            while ((line = br.readLine()) != null) {
                forRemoveLines.add(line);
            }
            fileInputStream1.close();
            fileInputStream2.close();
            reader.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(allLines);
        System.out.println(forRemoveLines);

        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
        }

        System.out.println(allLines);
        for (String s : allLines) {
            System.out.println(s);
        }

        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {
      /*  Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
          Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.*/
      if (allLines.containsAll(forRemoveLines)){
          allLines.removeAll(forRemoveLines);
      } else{
          allLines.clear();
          throw  new CorruptedDataException();
      }



    /*  for (String line : forRemoveLines) {

            allLines.removeIf(str -> str.equals(line));
        }
        if (allLines.size() > 0) {
            allLines.clear();
            throw new CorruptedDataException();
        }*/
    }
}

