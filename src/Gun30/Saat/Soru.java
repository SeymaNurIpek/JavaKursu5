package Gun30.Saat;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
// Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

     int gun;
     int saat;
     int dakika;

        Scanner scan=new Scanner(System.in);
        System.out.println("Gun= ");
        gun=scan.nextInt();
        System.out.println("Saat= ");
        saat=scan.nextInt();
        System.out.println("Dakika= ");
        dakika=scan.nextInt();

//        int toplamSaniye=
//                gun
//                *Sabitler.birGundekiSaatSayisi
//                *Sabitler.birSaatDakSayisi
//                *Sabitler.birDakikadakiSaniyeSayisi
//                +
//                saat
//                *Sabitler.birSaatDakSayisi
//                *Sabitler.birDakikadakiSaniyeSayisi
//                +
//                dakika
//                *Sabitler.birDakikadakiSaniyeSayisi;
//       System.out.println("toplamSaniye = " + toplamSaniye);

        System.out.println("TplamSaniye= "+Sabitler.hesapla(gun,saat,dakika));
    }
}
