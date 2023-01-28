package Gun43;

import java.util.Scanner;

public class A01_RunTimeCompileExcaption {
    public static void main(String[] args) {
        System.out.println("Program calismaya basladi");
        String kelime = ""; // ; koymadik burda compile eror hata verdi


        System.out.println("Program calisti");
        // ekranda calismadan onceki hatalara DERLEME HATALAR denir  COMPILE ERROR, EXCEPTION denir


        // char harf=kelime.charAt(3); kelime de index yok biz 3 yazdik bu yuzden hata verdi
        // ekranda calisisrken hata verirsen RUNTIMECOMPILEEXCAPTION hatasi verir altta indexin disinacikti
        //Excaption beklenmeyen hata denir
        System.out.println("program basladi");
        for (int i = 0; i < 3; i++) {


        try {// hata bolgesine try{} icine aldik
            Scanner scan = new Scanner(System.in);
            System.out.println("sayi1=");
            int sayi1 = scan.nextInt();
            System.out.println("sayi2=");
            int sayi2 = scan.nextInt();
            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);//bolen 0 olursa tanimsiz olur ArithmeticException hata verir
            // 0 girme hatasi

        } catch (Exception hata) {// yakala hata mesajlarini hata isimli Ezception cinsinden deger verir
            System.out.println("hata. = " + hata.getMessage());
            System.out.println("Lutfen tekrar deneyiniz");
            i--;
        }



    }System.out.println("program bitti");
    }
}
