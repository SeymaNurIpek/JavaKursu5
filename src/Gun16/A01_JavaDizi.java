package Gun16;

import java.util.Scanner;

public class A01_JavaDizi {
    public static void main(String[] args) {
        int ogrNot;// 1 tane not saklar

        //50 kisi varsa peki
        // benim bir tanimlamada birden fazla deger tutan bir degiskene ihtiyacimiz var
        //COZUM:
        int ogrNot20=0;
        int[] notlar=new int[5];// 50 tane int saklayabilen isimli degisken

        //[50] ise 0`dan 49`a kadar gider length-1 `e kadar gider
        notlar[0]=75;
        notlar[1]=78;



       //notlar[49]=95;
        System.out.println("notlar[0]="+notlar[0]);
        System.out.println("notlar.length= "+notlar.length);// 50 yani toplam eleman sayisini verir


        /*
        dizi nasil okutulur
         */
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <notlar.length; i++)
        {//okuma yapiliyor
            System.out.println("Notu giriniz= ");
            notlar[i]=scan.nextInt();

        }
        for (int i = 0; i < notlar.length; i++) {
            //yazma yapiliyor
            System.out.println(notlar[i]);

        }


    }
}
