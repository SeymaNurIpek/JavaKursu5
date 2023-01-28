package Gun11;

import java.util.Scanner;

public class A04_Ternary2 {
    public static void main(String[] args) {
        /*
         Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayiz yaziniz");
        int sayi=scan.nextInt();

        System.out.println((sayi>50)? "1" : "0");

        //2. yontem
        String  deger=(sayi>50) ? "1" : "0";
        System.out.println(deger);

        //3. yontem
        int sonuc=(sayi>50) ? 1 : 0;
        System.out.println(sonuc);

    }
}
