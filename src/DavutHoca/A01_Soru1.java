package DavutHoca;

import java.util.Scanner;

public class A01_Soru1 {
    public static void main(String[] args) {
        /*
        Ayse ünüversitede okuyan bir ögrencidir. Bir sömestrda 2 adet sinav olacaktir. Yilsonu notunu hesaplayan kisa bir program yazalim.

Girdigi ilk sinavin (vize) %40 i
ikinci sinavin (final sinavi) %60 i notunu belirleyecektir.
Iki sinavdan aldigi puan -->
60-100 --> arasinda ise Tebrikler gectiniz
40-60  --> arasinda ise  extra bütünleme sinavina girmelisiniz
0-40 --> arasinda ise malesef ders tekrari yapmalisiniz yazsin

not: vize ve final notunu biz manuel olarak girelim.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen vize notunuzu giriniz");
       double vize=scan.nextDouble();
        System.out.println("Lutfen final notunuzu giriniz");
       double final1= scan.nextDouble();
        double gecmeNotu=(vize*40/100)+(final1*60/100);
        System.out.println("Notunuz: "+gecmeNotu);

        if (gecmeNotu<0 || gecmeNotu>100){
            System.out.println("gecersiz not girdiniz");
        }
        if (gecmeNotu>=0 && gecmeNotu<40){
            System.out.println("malesef ders tekrari yapmalisiniz");
        }
        if (gecmeNotu>=40 && gecmeNotu<60){
            System.out.println("extra butunleme sinavina girmelisiniz");
        }
        if (gecmeNotu>=60 && gecmeNotu<100){
            System.out.println("Tebrikler gectiniz");
        }

    }
}
