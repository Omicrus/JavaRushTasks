package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/
public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", null);
        map.put("country", "");
        map.put("city", null);
        map.put(null, "ani");
        System.out.println(getQuery(map));

    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry item : params.entrySet()) {
            if (item.getValue() != null) {
                sb.append(item.getKey())
                        .append(" = ")
                        .append("'")
                        .append(item.getValue())
                        .append("'")
                        .append(" and ");
            }
        }
        if (sb.length() != 0) {
            sb.delete(sb.length() - 4, sb.length());
        }
        return sb.toString().trim();
    }
}
