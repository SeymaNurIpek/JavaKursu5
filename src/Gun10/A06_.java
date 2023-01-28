package Gun10;

import java.util.Scanner;

public class A06_ {
    public static void main(String[] args) {
        /*
// Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();

        if (sifre.length()>=8 && !sifre.toLowerCase().contains("pass") || sifre.length()<=12 ){
            System.out.println("Sifreniz uygun");
        }
        else {
            System.out.println("Lutfen uygun sifre giriniz");
        }
    }
}
