package AhmetHoca.UcuncuHafta;

import java.util.Scanner;

public class Hafta3_Soru5 {
    public static void main(String[] args) {
        /*
        verilen bir sayini faktoriyelini bulunuz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

         int carpim=1;
        for (int i = 1; i <=sayi ; i++) {
            carpim*=i;


        }
        System.out.println("Faktoriyel= "+carpim);

    }
}
