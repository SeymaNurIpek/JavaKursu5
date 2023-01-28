package Gun14;

import java.util.Scanner;

public class A08_Continue {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 sayi isteyin ve 6-10 arasindakiler haric, digerlerini toplayin
         */
        Scanner scan= new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i <5; i++) {
            System.out.println("Bir sayi giriniz= ");
            int sayi=scan.nextInt();

            System.out.println("toplam= "+toplam);






            if (sayi>6 && sayi<10)
            continue;
            //calistiginda kendinden sonra gelen komutlari pas gecirir
            // break ve contiune if ile calisir break donguyu kirar

            toplam=toplam+sayi;




        }

    }
}
