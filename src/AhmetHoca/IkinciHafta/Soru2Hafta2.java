package AhmetHoca.IkinciHafta;

import java.util.Scanner;

public class Soru2Hafta2 {
    public static void main(String[] args) {
        String userName = "TechnoStudy";
        String password = "12345";
        //
        //// ORNEK SORU : Yukarıdaki kayıtlı bilgilere göre kullanıcıdan, kullanıcı adı ve şifre alarak
        //// 4 farklı opsiyon için login işlemlerini yazınız.
        //
        //// 1.opsiyon - kullanıcı adı ve şifre hatalı
        //// 2.opsiyon - şifre hatalı
        //// 3.opsiyon - kullanıcı adı hatalı
        //// 4.opsiyon - sisteme giriş başarılı.

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz: ");
        String kullanıcıAdı= scan.nextLine();

        System.out.println("Şifre giriniz");
        String şifre = scan.nextLine();

        if (kullanıcıAdı != userName && password != şifre)
            System.out.println("kullanıcı adı ve şifre hatalı");
        else if (password != şifre && kullanıcıAdı == userName)
            System.out.println("şifre hatalı");
        else if (kullanıcıAdı!= userName && şifre == password)
            System.out.println("kullanıcı adı hatalı");
        else if (kullanıcıAdı == userName && password == şifre)
            System.out.println("GİRİŞ BAŞARILI");
        else
            System.out.println("Lütfen geçerli bir değer giriniz");



    }
}
