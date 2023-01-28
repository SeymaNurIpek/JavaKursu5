package Gun11;

import java.util.Scanner;

public class A05_ternary3 {
    public static void main(String[] args) {
        /*
        Girilen bir sayinin sifir mi negatif mi pozitif mi oldugunu Ternary operatoru ile yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayiz yaziniz");
        int sayi=scan.nextInt();
        //1. yontem
        System.out.println(sayi==0 ? "sifir" :sayi>0 ? "pozitif" : "negatif");

        // 2. yontem
        String deger=sayi==0 ? "sifir" :sayi>0 ? "pozitif" : "negatif";
        System.out.println(deger);



    }
}
