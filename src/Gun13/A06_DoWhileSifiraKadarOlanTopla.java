package Gun13;

import java.util.Scanner;

public class A06_DoWhileSifiraKadarOlanTopla {
    public static void main(String[] args) {
        /*
        Kullanici 0 girene kadar girdigi sayilarin toplamini bulunuz
         */
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        System.out.println("sayi giriniz= ");
        sayi=scan.nextInt();
        toplam=toplam+sayi;// ilk degerleri alsin diye donguden once yazdik

        while (sayi !=0){

            System.out.println("sayi giriniz=");
            sayi=scan.nextInt();

            toplam=toplam+sayi;

        }
        System.out.println("toplam= "+toplam);
    }
}
