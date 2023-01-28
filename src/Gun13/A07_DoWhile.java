package Gun13;

import java.util.Scanner;

public class A07_DoWhile {
    public static void main(String[] args) {
         /*
        Kullanici 0 girene kadar girdigi sayilarin toplamini bulunuz
         */
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        do{// dongu sarti basta olmadigindan en az bir kere calisir ve konrol sonda
            System.out.println("sayi giriniz=");
            sayi=scan.nextInt();

            toplam=toplam+sayi;

        }while (sayi !=0);
        System.out.println("Toplam ="+toplam);


    }
}
