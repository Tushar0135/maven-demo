package org.example;
import java.util.ArrayList;
public class gift {
    ArrayList<sweets> sl;
    String message;
    int tweight;

    public gift(ArrayList<sweets> sl,String message) {
        this.sl = sl;
        this.message=message;
    }
    public int totalWeight()
    {
        for(sweets s1:sl)
        {
            tweight+=s1.weight;
        }
        return tweight;
    }
}
