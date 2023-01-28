package AhmetHoca.DorduncuHafta;

import java.util.Scanner;

public class Hafta4_06 {
    public static void main(String[] args) {
        // Ornek 3 : Kullanici tarafindan girilen 5 pozitif sayinin toplamini hesaplayan
// Sayi 100 den buyuk ise hatali giris yapildigi ikazi vererek programi sonlandiran kodu yaziniz...


        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i <5; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            int sayi=scan.nextInt();
            if (sayi<0){
                i--;
                System.out.println("Pozitif sayi gir dedik ya");
                continue;

            }

            else if (sayi<=100) {
                toplam += sayi;
            } else{
                System.out.println("hatali giris");
                break;
            }


        }
        System.out.println("toplam = " + toplam);



    }
}
