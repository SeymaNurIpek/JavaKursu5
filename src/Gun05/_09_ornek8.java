package Gun05;

import java.util.Scanner;

public class _09_ornek8 {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen agirliginizi yaziniz");
        double agirlik=scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double boy=scan.nextDouble();
        System.out.println("agirliginiz: "+agirlik);
        System.out.println("Boyunuz: "+boy);
        System.out.println("Vucut kitle indeksiniz: "+(agirlik/(boy*boy)));
    }
}
