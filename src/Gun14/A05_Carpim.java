package Gun14;

import java.util.Scanner;

public class A05_Carpim {
    public static void main(String[] args) {
 /*
        Kullanicinin girecegi bir rakama kadar olan sayilarin Carpimini (faktoriyelini) bulunuz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int carpim=1;
        for (int i = 1; i <=sayi; i++) {
            carpim=carpim*i;
            System.out.println("carpim= "+carpim);

        }
    }
}
