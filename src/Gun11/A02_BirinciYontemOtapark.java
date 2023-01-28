package Gun11;

import java.util.Scanner;

public class A02_BirinciYontemOtapark {
    public static void main(String[] args) {
        /*
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Otoparkta kac saat kaldiginizi yaziniz");
        double saat=scan.nextDouble();

        if (saat<=3){
            System.out.println("10 Tl odeyiniz");
        }else {
            if (saat>3 &&  saat<=5){
                System.out.println("15 tl odeyiniz");
            }
            else {
                System.out.println(" 20 tl odeyiniz");
            }
        }


    }
}
