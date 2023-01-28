package AhmetHoca.DorduncuHafta;

import java.util.Arrays;

public class Hafta4_03 {
    public static void main(String[] args) {
     int[] dizi=new int[5];// 5 elemanli bir dizi

        dizi[0]=3;// ekleyebiliriz

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=i;
            System.out.println(i+"="+dizi[i]);
        }

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
}
