package com.javarush.task.task22.task2207;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ForeverTest {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()), "UTF-8"))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] strings = s.trim().split("\\s");
                arrayList.addAll(Arrays.asList(strings));

            }
            System.out.println(arrayList);
            for (int i = 1; i < arrayList.size(); ) {
                System.out.println(arrayList);
                StringBuilder sb = new StringBuilder();
                sb.append(arrayList.get(0));
                if (sb.reverse().toString().equals(arrayList.get(i))) {
                    Pair pair = new Pair();
                    pair.first = arrayList.get(0);
                    pair.second = arrayList.get(i);
                    result.add(pair);
                    arrayList.remove(i);
                    arrayList.remove(0);
                    i = 1;
                } else {
                    i++;
                    if (i == arrayList.size() - 1) {
                        i = 1;
                        arrayList.remove(0);
                    }
                }
            }
            System.out.println(result);
        }

    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (!Objects.equals(first, pair.first)) return false;
            return Objects.equals(second, pair.second);

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? "first:" + first + " , second:" + second : "second:" + second + " , first:" + first;

        }
    }
}

