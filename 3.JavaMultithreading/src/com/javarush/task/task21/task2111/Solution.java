package com.javarush.task.task21.task2111;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/* 
Освобождаем ресурсы
Требования:
1. Метод finalize в классе Solution должен содержать вызов super.finalize().
2. Метод finalize в классе Solution должен корректно завершаться в случае, если значение поля connection равно null.
3. Метод finalize в классе Solution должен закрывать текущее соединение, если значение поля connection не равно null.
4. Метод getUsers должен корректно использовать try-with-resources.
*/
public class Solution implements AutoCloseable {
    private Connection connection;

    public Solution(Connection connection) {
        this.connection = connection;
    }

    public static void main(String[] args) {

    }

    @Override
    protected void finalize() {

        try {
            if (connection != null) {
                connection.close();
            }else super.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }


    }

    public List<User> getUsers() {
        String query = "select ID, DISPLAYED_NAME, LEVEL, LESSON from USER";

        List<User> result = new LinkedList<>();


        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("DISPLAYED_NAME");
                int level = rs.getInt("LEVEL");
                int lesson = rs.getInt("LESSON");

                result.add(new User(id, name, level, lesson));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    @Override
    public void close() throws Exception {

    }

    public static class User {
        private int id;
        private String name;
        private int level;
        private int lesson;

        public User(int id, String name, int level, int lesson) {
            this.id = id;
            this.name = name;
            this.level = level;
            this.lesson = lesson;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", level=" + level +
                    ", lesson=" + lesson +
                    '}';
        }
    }
}
