package Gun13;

import java.util.Scanner;

public class A03_SoruToplam {
    public static void main(String[] args) {
        // Girilen 20 sayinin toplamini ekrana yazdirin
        Scanner scan=new Scanner(System.in);


        int sayac=1;
        int toplam=0;
        while (sayac<=20){
            System.out.print(sayac+".sayi giriniz= ");
            int sayi=scan.nextInt();
            toplam =toplam+sayi;
            sayac++;
        }
        System.out.println("Toplam = "+toplam);
    }
}
