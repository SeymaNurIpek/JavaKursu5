package Gun11;

import java.util.Scanner;

public class A01_ifelseSoru1 {
    public static void main(String[] args) {
         /*
        girilen bir sayinin pozitif, neegatif veya sifir oldugunu yazdirirniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        if (sayi>0){
            System.out.println("Sayiniz pozitif");}
        else {//ya sifirdir yada negatiftir
            if (sayi<0){
                System.out.println("Sayiniz negatif");
            }else {
                System.out.println("Sayiniz sifir");
            }
        }
    }
}
