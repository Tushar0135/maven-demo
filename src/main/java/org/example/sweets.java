package org.example;

public abstract class sweets implements Comparable<sweets> {
    String name;
    int weight;
    int calories;
    int price;
    public sweets(){}
    public sweets(String name, int weight,int calories,  int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.calories=calories;
    }


    public int compareTo(sweets s1)
    {
        return this.calories-s1.calories;
    }
    public String toString()
    {
        return name;
    }
}
