package org.example;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Scanner s= new Scanner(System.in);

            System.out.println("Enter the name of children");
            String name=s.next();
            System.out.println("Enter the age of children");
            int age=s.nextInt();
            child c1=new child(name,age);
        System.out.println("Enter the name of children");
        String cname=s.next();
        System.out.println("Enter the age of children");
        int cage=s.nextInt();
        child c2=new child(cname,cage);
        System.out.println("Enter the name of children");
        String c1name=s.next();
        System.out.println("Enter the age of children");
        int c1age=s.nextInt();
        child c3=new child(c1name,c1age);


            System.out.println("Enter the name of chocolate");
            String ch1name=s.next();
            System.out.println("Enter the weight of chocolate");
            int ch1weight=s.nextInt();
            System.out.println("Enter the calories in chocolate");
            int ch1cal=s.nextInt();
            System.out.println("Enter the price of chocolate");
            int ch1price=s.nextInt();
            sweets coclate1=new choco(ch1name,ch1weight,ch1cal,ch1price);

        System.out.println("Enter the name of chocolate");
        String ch2name=s.next();
        System.out.println("Enter the weight of chocolate");
        int ch2weight=s.nextInt();
        System.out.println("Enter the calories in chocolate");
        int ch2cal=s.nextInt();
        System.out.println("Enter the price of chocolate");
        int ch2price=s.nextInt();
        sweets coclate2=new choco(ch2name,ch2weight,ch2cal,ch2price);

        System.out.println("Enter the name of chocolate");
        String ch3name=s.next();
        System.out.println("Enter the weight of chocolate");
        int ch3weight=s.nextInt();
        System.out.println("Enter the calories in chocolate");
        int ch3cal=s.nextInt();
        System.out.println("Enter the price of chocolate");
        int ch3price=s.nextInt();
        sweets coclate3=new choco(ch3name,ch3weight,ch3cal,ch3price);

            System.out.println("Enter the name of cake");
            String ckname=s.next();
            System.out.println("Enter the weight of cake");
            int ckweight=s.nextInt();
            System.out.println("Enter the calories in cake");
            int ckcal=s.nextInt();
            System.out.println("Enter the price of cake");
            int ckprice=s.nextInt();
            sweets cak=new choco(ckname,ckweight,ckcal,ckprice);

        System.out.println("Enter the name of cake");
        String ck1name=s.next();
        System.out.println("Enter the weight of cake");
        int ck1weight=s.nextInt();
        System.out.println("Enter the calories in cake");
        int ck1cal=s.nextInt();
        System.out.println("Enter the price of cake");
        int ck1price=s.nextInt();
        sweets cak1=new choco(ck1name,ck1weight,ck1cal,ck1price);

        System.out.println("Enter the name of cake");
        String ck2name=s.next();
        System.out.println("Enter the weight of cake");
        int ck2weight=s.nextInt();
        System.out.println("Enter the calories in cake");
        int ck2cal=s.nextInt();
        System.out.println("Enter the price of cake");
        int ck2price=s.nextInt();
        sweets cak2=new choco(ck2name,ck2weight,ck2cal,ck2price);

            System.out.println("Enter the name of candy");
            String cnname=s.next();
            System.out.println("Enter the weight of candy");
            int cnweight=s.nextInt();
            System.out.println("Enter the calories in candy");
            int cncal=s.nextInt();
            System.out.println("Enter the price of candy");
            int cnprice=s.nextInt();
            sweets cand=new choco(cnname,cnweight,cncal,cnprice);
        System.out.println("Enter the name of candy");
        String cn1name=s.next();
        System.out.println("Enter the weight of candy");
        int cn1weight=s.nextInt();
        System.out.println("Enter the calories in candy");
        int cn1cal=s.nextInt();
        System.out.println("Enter the price of candy");
        int cn1price=s.nextInt();
        sweets cand1=new choco(cn1name,cn1weight,cn1cal,cn1price);

        System.out.println("Enter the name of candy");
        String cn2name=s.next();
        System.out.println("Enter the weight of candy");
        int cn2weight=s.nextInt();
        System.out.println("Enter the calories in candy");
        int cn2cal=s.nextInt();
        System.out.println("Enter the price of candy");
        int cn2price=s.nextInt();
        sweets cand2=new choco(cn2name,cn2weight,cn2cal,cn2price);


        ArrayList<sweets> a1=new ArrayList<sweets>();
        a1.add(coclate1);
        a1.add(cak);
        a1.add(cand);
        ArrayList<sweets> a2=new ArrayList<sweets>();
        a2.add(coclate2);
        a2.add(cak1);
        a2.add(cand1);
        ArrayList<sweets> a3=new ArrayList<sweets>();
        a3.add(cak1);
        a3.add(cak2);
        a3.add(cand1);
        gift gift1=new gift(a1,"Sent with a lots of wishes");
        gift gift2=new gift(a2,"Sent with a lots of wishes");
        gift gift3=new gift(a3,"Sent with a lots of wishes");
        c1.give(gift1,c2);
        c2.give(gift2,c1);
        c3.give(gift3,c1);
        c1.give(gift1,c3);
        c1.show();
        c2.show();
        c3.show();
    }
}
