package Gun12;

import java.util.Scanner;

public class A02_ {
    public static void main(String[] args) {
// Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayi=");
        int sayi1=scan.nextInt();
        System.out.print("Ikincici sayi=");
        int sayi2=scan.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");

        System.out.println("Seciminiz");
        Scanner scanStr=new Scanner((System.in));
        String  secim=scanStr.next();

        if (secim.equalsIgnoreCase("T")){
            System.out.println("Toplam= "+(sayi1+sayi2));
        } else if (secim.equalsIgnoreCase("C")) {
            System.out.println("Farki= "+(sayi1-sayi2));

        } else if (secim.equalsIgnoreCase("P")) {
            System.out.println("Carpimi= "+(sayi1*sayi2));

        } else if (secim.equalsIgnoreCase("B")) {
            System.out.println("Carpimi= "+(sayi1/sayi2));

        }else {
            System.out.println("secimi dogru yapsana ya");
        }

    }
}
