package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов(детали уточни у своего любимого поисковика).
Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.

*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution(null, null));
        System.out.println(s.size());
        System.out.println(s.contains(new Solution("Donald", "Duck")));
        for (Solution sol : s) {
            System.out.println(sol.hashCode());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Solution)) return false;

        Solution n = (Solution) obj;

        return ((this.first == n.first || (this.first != null && this.first.equals(n.first)))&&
                (this.last==n.last||(this.last != null && this.last.equals(n.last))));

    }

    @Override
    public int hashCode() {
        int number = 1;
        int hash = 31 * number + ((this.first == null) ? 0 : this.first.hashCode());
        hash += 31 * number + ((this.last == null) ? 0 : this.last.hashCode());
        return hash;
    }
}


  /* if ((this.first != null && n.first != null) && (this.last != null && n.last != null)) {
            return n.first.equals(first) && n.last.equals(last);
        } else {
            return false;
        }*/