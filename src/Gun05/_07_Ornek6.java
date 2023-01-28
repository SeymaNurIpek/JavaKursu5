package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b
        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdortgenin Kisa Kenarini giriniz");
        int kisaKenar=scan.nextInt();
        System.out.println("Dikdortgeniz uzun kenarini giriniz");
        int uzunKenar= scan.nextInt();

        System.out.println("ISekil: "+(2*uzunKenar+2*kisaKenar));
        System.out.println("Alan: "+(kisaKenar*uzunKenar));
    }
}
