package Gun09;

import java.util.Scanner;

public class _02_Soru2 {
    public static void main(String[] args) {
        /*
        Girilen bir sayinin pozitif mi negatif mi oldugunu yazdiriniz
        sifir ise sifir yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi= scan.nextInt();

        if (sayi>0){
            System.out.println("sayi pozitiftir");
        }
        if (sayi<0){
            System.out.println("sayi negatiftir");
        }
        if (sayi==0){
            System.out.println("sayi 0 `dir");
        }

    }
}
