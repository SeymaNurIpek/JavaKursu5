package AhmetHoca.DorduncuHafta;

import java.util.Arrays;

public class Hafta4_04 {
    public static void main(String[] args) {
// Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...
        int [] arr = new int [] {11, 22, 33, 99, 88, 77};

        //1. yontem
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        
        //2. yontem

        int enb=arr[0];
        for (int i = 0; i < args.length ; i++) {
            if (arr[i]>enb){
               enb= arr[i];
            }
            

        }
        System.out.println("enb = " + enb);
    }
}
