package Gun14;

import java.util.Scanner;

public class A04_SoruToplam {
    public static void main(String[] args) {
        /*
        Kullanicinin girecegi bir rakama kadar olan sayilarin toplamini bulunuz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;
        for (int i = 0; i <=sayi; i++) {
            toplam=toplam+i;
            System.out.println("toplam = "+toplam);

        }
    }
}
