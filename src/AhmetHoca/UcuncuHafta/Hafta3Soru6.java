package AhmetHoca.UcuncuHafta;

import java.util.Scanner;

public class Hafta3Soru6 {
    public static void main(String[] args) {
        /*
        girilen bir sayinin asal olup olmadigini bulunuz
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1 den buyuk bir sayi giriniz");
        int sayi1=scan.nextInt();
        int bayrak=0;
        for (int i = 2; i <sayi1-1 ; i++) {
            if (sayi1 % i == 0) {

                bayrak++;

                break;

            }
        }
            if (bayrak == 0) {
                System.out.println("asaldir");
            } else {
                System.out.println("Asal degildir");
            }
            //Scanner oku1 = new Scanner(System.in);
        //System.out.print("Lutfen bir sayi giriniz : ");
        //int sayi = oku1.nextInt();
        //int sayac = 0;
        //if (sayi < 1) {
        //System.out.println("lutfen 1 den buyuk bir sayi giriniz");
        //} else {
        //for (int i = 1; i <= sayi; i++) {
        //if (sayi % i == 0) {
        //sayac++;
        //}
        //}
        //if (sayac == 2) {
        //System.out.println("sayi asaldir");
        //} else {
        //System.out.println("asal degildir");
        //}
        //}

        }

}

