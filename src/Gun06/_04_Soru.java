package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        /*
        Girilen bir Stringin son harfini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scan.nextLine();

        /*
        012345= harflerin oda numaralari
        bugun = son harfin oda numarasi uzunlugun nesi? 1 eksigi
         */

        int uzunluk= metin.length();
        char sonHarf=metin.charAt(uzunluk-1);
        System.out.println("SonHarf: "+sonHarf);

        System.out.println("SonHarf: "+ metin.charAt(metin.length()-1));

    }
}
