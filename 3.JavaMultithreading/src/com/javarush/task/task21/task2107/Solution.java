package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/*
Глубокое клонирование карты
Обеспечь возможность клонирования объекта класса Solution используя глубокое клонирование.
Данные в карте users также должны быть клонированы.
Не забудь о методах equals и hashCode для корректного добавления элементов типа User в HashMap.


Требования:
1. Класс Solution должен поддерживать интерфейс Cloneable.
2. Класс User должен поддерживать интерфейс Cloneable.
3. В классе User должен быть корректно реализован метод clone.
4. В классе Solution должен быть корректно реализован метод clone.
*/
public class Solution implements Cloneable {

    protected Map<String, User> users = new LinkedHashMap();

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));

        Solution clone = null;

        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
            System.out.println(solution.users.equals(clone.users));


        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution solution = (Solution) super.clone();
        solution.users = new LinkedHashMap<>();
        for (Map.Entry<String, User> item : users.entrySet()) {
            solution.users.put(item.getKey(), item.getValue());
        }
        return solution;

    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(this.getClass() == obj.getClass())) return false;
            User user = (User) obj;
            if (!(this.age == user.age)) return false;
            if (!Objects.equals(this.name, user.name)) return false;
            return true;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }
    }
}