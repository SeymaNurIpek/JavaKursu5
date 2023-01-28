package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class A01_RandomKullanici {
    public static void main(String[] args) {
        /*
         // 10 elemanlı bir diziyi random(10dahil) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.
        // Math.Random -> 0- 0,99   -> 10 *   0- 9,9999 -> 0-9
         */

        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);
            //10 elemanli bir diziyi random sayiyi yazdirdik

        }
        System.out.println(Arrays.toString(dizi));

        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 10 arasinda aranacak sayiyi yaziniz= ");
        int arananRakam=scan.nextInt();

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]==arananRakam){
                System.out.println("var ve oda numarasi"+i+". indexde");
            }

        }


       /* //2. yontem
        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);
            //10 elemanli bir diziyi random sayiyi yazdirdik

        }
        System.out.println(Arrays.toString(dizi));

        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 10 arasinda aranacak sayiyi yaziniz= ");
        int arananRakam=scan.nextInt();

        boolean bulundu=false;

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]==arananRakam){
                bulundu=true;
                System.out.println("var ve oda numarasi "+i+". indexde");
            }


        }
        if (!bulundu){
            System.out.println("Bulumadi");
        }*/
    }
}
