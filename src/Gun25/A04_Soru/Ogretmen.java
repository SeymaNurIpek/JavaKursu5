package Gun25.A04_Soru;

import Gun25.A04_Soru.Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogretmen {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        ArrayList<Ogrenci> snf=new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Okul No= "); ogr.okulNo=scanInt.nextInt();
            System.out.print("Notu= "); ogr.notu=scanInt.nextInt();
            System.out.print("tamAdi= "); ogr.tamAdi=scanStr.nextLine();

            snf.add(ogr);

        }

        bilileriYazdir(snf);
        ortalamaYaz(snf);
    }

    private static void ortalamaYaz(ArrayList<Ogrenci> snf) {
        int toplam=0,ortalama=0;
        for (Ogrenci ogr:snf) {
            toplam+=ogr.notu;
           ortalama=toplam/snf.size();

        }
        System.out.println("ortalama = " + ortalama);

    }

    public static void bilileriYazdir(ArrayList<Ogrenci> snf) {
        for (Ogrenci ogr:snf) {
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr = " + ogr.notu);

        }
    }
}
