package Gun10;

import java.util.Scanner;

public class A03_TekMiCiftMi {
    public static void main(String[] args) {
/*
// Girilen bir sayının tek mi çift mi olduğunu yazdırınız.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiginiz sayi cift");
        } else {
            System.out.println("Girdiginiz sayi tek");
        }
    }
}
