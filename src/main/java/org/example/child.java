package org.example;

import java.util.ArrayList;

public class child {
    String name;
    int age;
    ArrayList<gift> gifts=new ArrayList<gift>();
    public child(){}
    public child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void give(gift gift,child c)
    {
        c.take(gift);
    }
    public void take(gift gift)
    {
        gifts.add(gift);
    }
    public void show()
    {
        System.out.println(this.name+":");
        for(gift g:gifts)
        {
            System.out.println(g.sl+" Total Weight="+g.totalWeight()+"g Message="+g.message);
        }
    }
}
