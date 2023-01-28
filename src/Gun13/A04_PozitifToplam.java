package Gun13;

import java.util.Scanner;

public class A04_PozitifToplam {
    public static void main(String[] args) {
        /*
        Girilen 20 sayidan sadece pozitif olanlarini bulunuz
         */
        Scanner scan=new Scanner(System.in);


        int sayac=1;
        int toplam=0;
        while (sayac<=20){
            System.out.print(sayac+".sayi giriniz= ");
            int sayi=scan.nextInt();


            if (sayi>0){
                toplam =toplam+sayi;

            }
            sayac++;


        }
        System.out.println("Toplam= "+toplam);

    }
}
