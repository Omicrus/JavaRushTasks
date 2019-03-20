package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //   File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream("data.txt");
            InputStream inputStream = new FileInputStream("data.txt");

            JavaRush javaRush = new JavaRush();


            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            User user1 = new User();
           // user1.setFirstName("eugen");
            user1.setLastName("Mihailov");
            Date date = format.parse("18 05 1985");
            user1.setBirthDate(date);
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);

            System.out.println(javaRush.users.size());

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            System.out.println(loadedObject.users.size());

            for (int i = 0; i < loadedObject.users.size(); i++) {
                System.out.println(loadedObject.users.get(i).getFirstName());
                System.out.println(loadedObject.users.get(i).getLastName());
                System.out.println(loadedObject.users.get(i).getBirthDate());
                System.out.println(loadedObject.users.get(i).isMale());
                System.out.println(loadedObject.users.get(i).getCountry().getDisplayName());
            }


            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);
            if (users != null) {
                for (User user : users) {
                    pw.println(user.getFirstName());
                    pw.println(user.getLastName());
                    pw.println(user.getBirthDate());
                    pw.println(user.isMale());
                    pw.println(user.getCountry().getDisplayName());
                    pw.flush();
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while (br.ready()) {
                User user = new User();
                String firstName = br.readLine();
                if (firstName.equals("null")) {
                    user.setFirstName(null);
                } else {
                    user.setFirstName(firstName);
                }
                user.setLastName(br.readLine());
                Date date = format.parse(br.readLine());
                user.setBirthDate(date);
                user.setMale(Boolean.valueOf(br.readLine()));
                switch (br.readLine()) {
                    case "Russia":
                        user.setCountry(User.Country.RUSSIA);
                        break;
                    case "Ukraine":
                        user.setCountry(User.Country.UKRAINE);
                        break;
                    case "Other":
                        user.setCountry(User.Country.OTHER);
                        break;
                }
                users.add(user);
            }
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
