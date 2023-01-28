package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        /*
        Girilen bir sayiya kadar olan sayilardan tam kare varsa dursun
         */
        Scanner scan= new Scanner(System.in);

        int sayi;
        int sayac=0;


        do {
            System.out.println("Lutfen bir sayi giriniz" );
            sayi= scan.nextInt();
            if (sayac*sayac==sayi)
                System.out.println("Tam karedir");
            sayac++;
            break;



        }while (sayac<sayi);
        System.out.println("Bitti");
    }
}
