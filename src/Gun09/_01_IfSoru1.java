package Gun09;

import java.util.Scanner;

public class _01_IfSoru1 {
    public static void main(String[] args) {
        /*
        Girilen bir sayi 10`dan buyuk ise 10`dan buyuk yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Sayi giriniz= ");
        int sayi= scan.nextInt();

        if (sayi>10){
            System.out.println("10`dan buyuk");
            System.out.println("if`in icinde birden fazla komut varsa if parantezleri sarttir");
        }
    }
}
