package Gun11;

import java.util.Scanner;

public class A09_Soru {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Uretilecek sayi giriniz= ");
        int sinir=scan.nextInt();

        int tutulanSayi=(int) (Math.random()*sinir);

        System.out.println("Tahmininiz");
        int tahmin=scan.nextInt();

        if (tahmin==tutulanSayi){
            System.out.println("tebrikler");
        }else {
            System.out.println("Bilemedin ki bilemedin ki");
        }



    }
}
