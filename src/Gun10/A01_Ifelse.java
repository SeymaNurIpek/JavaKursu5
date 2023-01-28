package Gun10;

import java.util.Scanner;

public class A01_Ifelse {
    public static void main(String[] args) {
        /*
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.
         */
        Scanner oku=new Scanner(System.in);
        System.out.print("Ogrenci notu=");
        int ogrNot= oku.nextInt();

        if (ogrNot>=50){
            System.out.println("Gectiniz");
        } else if (ogrNot<50) {
            System.out.println("Kaldiniz");

        }
    }
}
