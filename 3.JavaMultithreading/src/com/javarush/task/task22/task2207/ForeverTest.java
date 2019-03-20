package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Обращенные слова
*/
public class ForeverTest {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()), StandardCharsets.UTF_8))) {
            StringBuilder mainString = new StringBuilder();
            while (br.ready()) {
                mainString.append(br.readLine()).append(" ");
            }

            System.out.println(mainString.toString());//рот тор торт о о тот тот тот трот трот трот торг грот

            Pattern pattern = Pattern.compile("(\\p{L}+)");
            Matcher matcher = pattern.matcher(mainString.toString());

            while (matcher.find()) {
                String tmp = matcher.group(0);
                mainString.delete(matcher.start(0), matcher.end(0) + 1);

                if (mainString.toString().contains(new StringBuilder(tmp).reverse().toString()) && mainString.length() > 0) {
                    Pattern pattern1 = Pattern.compile(new StringBuilder(tmp).reverse().toString());
                    Matcher matcher1 = pattern1.matcher(mainString.toString());
                    if (matcher1.find()) {
                        String tmpSecond = matcher1.group(0);
                        Pair p = new Pair();
                        p.first = tmp;
                        p.second = tmpSecond;
                        result.add(p);
                        mainString.delete(matcher1.start(0), matcher1.end(0) + 1);
                        matcher1.reset(mainString);
                        matcher.reset(mainString);
                    }
                } else {
                    matcher.reset(mainString);
                }
            }
        }

        System.out.println(result);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

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
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
