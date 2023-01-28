package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        /*
        tek seferde girilen ad soyadin adini ve soyadini ayirip
        ayri ayri yazdiriniz(sadece ad ve soyad)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Adiniz ve soyadiniz= ");
        String adSoyad=scan.nextLine();

        //seyma ipek
        // ad: 0`dan boslugun index`ine kadar
        //soyad: bosluk+1  den sonuna kadar

        int boslukIndex=adSoyad.indexOf(" ");
        String  ad=adSoyad.substring(0,boslukIndex);
        String soyad=adSoyad.substring(boslukIndex+1); // 2. index ivermessen sonuna kadar gider

        System.out.println("ad= "+ad);
        System.out.println("soyad= "+soyad);




    }
}
