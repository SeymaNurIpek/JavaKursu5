package Gun10;

import java.util.Scanner;

public class A04_Soru {
    public static void main(String[] args) {
        /*
          // Mantıksal ifadeler
        //  &&  ve işaretimiz (shift-6)
        //  ||  veya işaretimiz ((altGr  <)

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>0 && sayi%2!=0){
            System.out.println("uygun sayı girildi");
        }
        else {
            System.out.println("uygun sayı girilmedi");
        }

    }
}
