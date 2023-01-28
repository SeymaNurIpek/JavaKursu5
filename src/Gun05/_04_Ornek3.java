package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        /*
        Kullanicidan adini ve soyadini ayri ayri okutarak alip birlikte yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad=scan.nextLine();

        System.out.println("adiniz: "+ad);
        System.out.println("soyadiniz: "+soyad);
        System.out.println("adiniz ve soyadiniz: "+ad+" "+soyad);
    }
}
