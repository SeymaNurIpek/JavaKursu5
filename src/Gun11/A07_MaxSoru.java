package Gun11;

import java.util.Scanner;

public class A07_MaxSoru {
    public static void main(String[] args) {
        /*
        Mth.max yontemi ile girilen 3 sayidan buyuk olanini bulunuz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi=");
        int a=scan.nextInt();
        System.out.println("2. sayi=");
        int b=scan.nextInt();
        System.out.println("3. sayi=");
        int c=scan.nextInt();

        // 1. yontem
        int enb=Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb= "+enb);

        //2. yontem
        int enb2=Math.max(a,Math.max(b,c));
        System.out.println("enb2= "+enb2);


    }
}
