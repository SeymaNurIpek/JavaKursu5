package Gun10;

import java.util.Scanner;

public class A08_Odev {
    public static void main(String[] args) {
        /*
         // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayilari 1 bosluk  bırakarak 3 tam sayi giriniz=");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();

        int toplam=+(sayi3+sayi1+sayi2);

        if (toplam%2==0){
            System.out.println("Cift");
        }
        else {
            System.out.println("tek");
        }

    }
}
