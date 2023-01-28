package Gun11;

import java.util.Scanner;

public class A03_Ternary {
    public static void main(String[] args) {
        /*
        Girilen sayinin tek mi cift mi oldugunuz yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayiz yaziniz");
        int sayi=scan.nextInt();
//1.
        String sonuc=(sayi%2==0) ?"Cift" : "Tek";
        System.out.println("sonuc= "+sonuc);
        System.out.println((sayi%2==0) ? "Cift" : "Tek");
    }
}
