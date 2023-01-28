package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aralarinda bosluk birakarak 2 tam sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        System.out.println("Girdiginiz iki sayinin toplami: "+(sayi1+sayi2));
    }
}
