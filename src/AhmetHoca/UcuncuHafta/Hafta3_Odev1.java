package AhmetHoca.UcuncuHafta;

import java.util.Scanner;

public class Hafta3_Odev1 {
    public static void main(String[] args) {
        /*
        // Ödev Soru 1: 0-100 arasındaki tek ve çift sayıların toplamını ayrı ayrı bulunuz
         */
/*
        int tekToplam=0;
        int cifttoplam=0;
        for (int i = 1; i <100; i++) {
            if (i%2!=0){
                tekToplam+=i;
            }

            else {
                cifttoplam+=i;

            }

        }System.out.println("Tek Toplam= "+tekToplam);
        System.out.println("Cift Toplam= "+cifttoplam);


*/
        /*
          //// Ödev Soru 2: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.
        //
        //// e
        //// ye
        //// iye
        //// kiye
        //// rkiye
        //// ürkiye
        // Turkiye
         */

/*

 /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ulke ismi giriniz");
        String ulke=scan.nextLine();
        int ulke1=ulke.length();
        String  tersUlke="";


        for (int i =ulke1-1; i >=0 ; i--) {
            tersUlke=ulke.substring(i);

            System.out.println(tersUlke);
        }


*/










        /*
         //// Ödev Soru3: Kullanıcıdan PIN kodunu alan ve kod doğru ise sisteme giriş yaptıran programı yazınız.
        //// Eğer PIN kodu üç kez yanlış girilirse kartı bloke ediniz.

         */

        Scanner scan=new Scanner(System.in);


        int eskiSifre=1907;
        int sifre=0;
        int sayac=0;

        do {
            if (sifre!=eskiSifre){
            System.out.println("Lutfen bir sifre giriniz= ");
            sifre=scan.nextInt();
            sayac++;}
        }while (sifre!=eskiSifre && sayac<3);

        if (sifre==eskiSifre){
            System.out.println("Sisteme basariyla giris yaptiniz");
        }else {
            System.out.println("sifrenizi cok sayida hatali girdiginiz icin kartiniz bloke edilmistir");
        }






    }
}
