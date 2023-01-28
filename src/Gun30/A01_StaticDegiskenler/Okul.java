package Gun30.A01_StaticDegiskenler;

public class Okul {
    public static void main(String[] args) {
        //        Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırım Ilkokulu");
//        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım Ilkokulu");
//        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım Ilkokulu");
//
//
//        // ...
//        //...
//        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım Ilkokulu");
//        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım Ilkokulu");

        Ogrenci ogr1=new Ogrenci("Seyma","Ipek");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Ataturk Ilkokulu";

         // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

        //static sadece 1 tane
        //en son yazan degeri alir
        System.out.println("ogr1  tekrar= " + ogr1);


    }
}
