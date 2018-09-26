package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
     /*   String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s1 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s1 + s2);
        System.out.println(s3 + s2 + s1);*/


                String[] s = new String[3];
                s[0] = "Мама";
                s[1] = "Мыла";
                s[2] = "Раму";

                for(int i =0; i<3;i++)
                    for(int j = 0; j<3;j++)
                        for(int z = 0; z<3; z++)
                            if(i!=j && i!=z && j!=z)
                                System.out.println(s[i]+s[j]+s[z]);

    }
}
