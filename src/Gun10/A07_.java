package Gun10;

import java.util.Scanner;

public class A07_ {
    public static void main(String[] args) {
        /*
         yan yana aralarında bir boslukla girilen 2 int sayının
         birbirine eşit olup olmadığını bulunuz
         45 67
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayilari 1 bosluk bırakarak giriniz=");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        if (sayi1==sayi2){
            System.out.println("Esit");
        }else {
            System.out.println("Degil");
        }


    }
}
