package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //Girilen bir ad soyadi "ismet  Temur" I.T. seklinde yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi ve soyisminizi giriniz");
        String adSoyad = scan.nextLine();

        // indexOf(" ")*> boslugun index    ini veriyor, bunun 1 fazlasi charAt() -> T`yi verir
        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

    }
}
