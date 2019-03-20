package com.javarush.task.task21.task2106;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution.


Требования:
1. Хешкоды одинаковых объектов должны быть равны.

4. Метод equals должен проверять значения всех полей у переданного объекта и текущего (учти что некоторые из них могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
6. В классе Solution должен быть реализован метод hashCode.
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(){
    }

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    public static void main(String[] args) {
        Set<Solution> hashset = new HashSet<>();

        Solution solution = new Solution(0,null,0,null,null);
        Solution solution1 = new Solution(0,null,0,null,null);

        System.out.println(solution.equals(solution1));

        hashset.add(solution);
        System.out.println(hashset.contains(new Solution(0,null,0,null,null)));
        System.out.println(hashset.size());

     //   System.out.println(new Solution(5,"ama",1.2,null, new Solution(0,null,0,null,null)));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution1 = (Solution) o;

        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anInt, string, aDouble, date, solution);
    }

  /* @Override
    public int hashCode() {
        int result = anInt;
        long temp;

        temp = (aDouble != +0.0d) ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }*/
}
