package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class A09_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[5];
        int toplam=0;
        int ortalam=0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" sayi= ");
            dizi[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(dizi));
        enBuyukYaz(dizi);
        enKucukYaz(dizi);







    }
    public static void enKucukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("enKucuk= "+sayilar[0]);
    }

    public static void enBuyukYaz(int[] sayilar){
        Arrays.sort(sayilar);
        System.out.println("enBuyuk= "+sayilar[sayilar.length-1]);
    }

    public static void ortalama(int[] sayilar){

    }
}

