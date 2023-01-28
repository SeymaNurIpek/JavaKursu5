package Gun32.A03_;

import java.util.Scanner;

public class Kampus {//  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        Okul yeniOkul=new Okul("Kabatas Okulu",3);
        do {
            System.out.print("Ogrenci adi= ");
            String ad=scanStr.nextLine();
            System.out.print("Ogrenci soyadi= ");
            String soyAd=scanStr.nextLine();
            System.out.print("Ogrenci yasi= ");
            int yas=scanInt.nextInt();

            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyAd,yas);
                yeniOkul.getOgrenciler().add(ogr);
            }else {
                System.out.println("Yasi uygun degil");
            }

        }while (yeniOkul.getOgrenciler().size()<yeniOkul.getKontenjan());


    }
}
