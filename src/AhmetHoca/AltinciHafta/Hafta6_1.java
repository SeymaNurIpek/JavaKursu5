package AhmetHoca.AltinciHafta;

import java.util.Arrays;
import java.util.HashSet;

public class Hafta6_1 {
    public static void main(String[] args) {


        HashSet<Integer>hs=new HashSet<>();
        addElements(hs,1,2,3);
        System.out.println("hs= "+hs);
        addElements(hs,1,2,3,4,5,6,7,8,9);
        System.out.println("hs = " + hs);

    }
   public static void addElements(HashSet<Integer> hs,Integer...sayilar){
        //1. yontem
        //hs.addAll(Arrays.asList(sayilar));

        // 2. yontem
       for (int i = 0; i <sayilar.length ; i++) {
           hs.add(sayilar[i]);
       }
   }
}
