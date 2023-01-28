package Gun17;

import java.util.Scanner;

public class A05_SplitMethod {
    public static void main(String[] args) {
        /*
        Split: Bir String`i parcalara ayirmak demek

        Kullanicidan alacaginiz cumleyi kelimalere gore alt alta yazdiriniz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cumle giriniz= ");
        String cumle=scan.nextLine();

         String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("Kelimeler= "+kelimeler[i]);


        }
    }
}
