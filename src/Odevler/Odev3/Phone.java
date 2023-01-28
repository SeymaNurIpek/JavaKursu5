package Odevler.Odev3;

import java.util.ArrayList;

public abstract class Phone {
    static ArrayList<String> cart=new ArrayList<>();

    static  int getSum(ArrayList<String> cart){
       int sum=0;
       for (String str:cart){
           sum+=Integer.parseInt(str.replaceAll("[^0-9]",""));
       }return sum;
    }
    abstract void options(String s1,String s2);
    }

