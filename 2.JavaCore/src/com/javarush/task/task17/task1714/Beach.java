package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach = new Beach("golden beach", 200, 100);
        Beach beach1 = new Beach("sunset beach", 250, 100);
        System.out.println(beach.compareTo(beach1));
        System.out.println(beach1.compareTo(beach));

    }

     /*Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число, которое показывает что первый
    пляж лучше (положительное число) или второй пляж лучше (отрицательное число), и насколько он лучше.*/


    @Override
    public synchronized int compareTo(Beach o) {

        return (int) ((int) this.getQuality() - this.getDistance() - o.getQuality() + o.getDistance());        // (50 - 200) - (100 - 250)  = -150 - 150 = 0


       /* int result;
        if (this.distance == o.distance && this.quality == o.quality) {
            return 0;
        } else if (this.distance == o.distance) {
            result = this.quality > o.quality ? 1 : -1;
        } else if (this.quality == o.quality) {
            result = this.distance < o.distance ? 1 : -1;
        } else {
           int result2 = this.distance < o.getDistance() ? 1 : -1;
           int result3 = this.quality > o.getQuality() ? 1 : -1;
            result = result2 + result3;
        }
        return result;*/
       /* int sum = 0;
        int result = 0;
        result = (int) (o.distance - this.distance);   // 250-200       200-250
        sum += result;                                 //50             -  40
        result = this.quality - o.quality;             //50-10
        sum +=result;                                  //40

        return sum;                                     // 50+40 = 90*/
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }


}
