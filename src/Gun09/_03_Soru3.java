package Gun09;

import java.util.Scanner;

public class _03_Soru3 {
    public static void main(String[] args) {
        /*
        girilen 2 sayidan buyuk olanini degerini ekrana yazdiriniz
        esit ise yazdiriniz
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi1>sayi2){
            System.out.println("buyuk sayi= "+sayi1);
        }
        if (sayi2>sayi1){
            System.out.println("buyuk sayi= "+sayi2);
    }
        if (sayi1==sayi2){
            System.out.println("sayi1 esittir sayi2");
        }
    }

}
