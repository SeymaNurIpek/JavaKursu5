package AhmetHoca.BesinciHafta;

import java.util.ArrayList;
import java.util.Arrays;

public class Hafta5_Soru2 {
    public static void main(String[] args) {
        //// Soru - 1 : TODO Bir Array i nasil Arraylist e donusturebilriz?....
        //
        String[] arr = { "Java", "Python", "C++" };

        ArrayList<String> yeni=new ArrayList<>(Arrays.asList(arr));
        System.out.println("yeni = " + yeni);

        for (int i = 0; i < arr.length ; i++) {
            yeni.add(arr[i]);
        }
        System.out.println("yeni = " + yeni);

        yeni.addAll(Arrays.asList(arr));
        System.out.println("yeni = " + yeni);
        
        
        

    }
}
