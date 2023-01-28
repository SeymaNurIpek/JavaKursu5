package Gun19;

import java.util.Arrays;

public class A08_20ElemanliDizi {
    public static void main(String[] args) {
        // main de 20 elemanlı bir diziyi tanimlayiniz, daha sonra bir fonksiyona
        // gondererek  random 100 e kadar olan  sayılarla
        // doldurunuz ve aynı fonksiyonda yazdırınız.

        int[] dizi=new int[20];  //int dizi[]=new int[20]; seklinde de yazabiliriz

        diziDoldurYazdir(dizi); //fonksiyon


    }
    public static void diziDoldurYazdir(int[] sayilar){
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int)(Math.random()*100);

        }
        System.out.println("Sayilar="+ Arrays.toString(sayilar));
    }
}
