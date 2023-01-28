package Gun20;

public class A01_MethodKonuAnlatim {
    public static void main(String[] args) {
        merhabaYaz();//giden yok donen yok
        topLamYaz(4,5);// giden var , donen yok(fonksiyonu esitleyebilir miyiz)
        int enb=Math.max(4,5);// giden var donen var
        double sayi=Math.random();// giden yok donen var

        enb=enbBul(4,5);
        System.out.println("Enbuyuk= "+enb);
        // fonksiyonda return oldugu icin mainde yazdirabiliyoruz
        //yani fonksiyonun sonucunu alabiliyoruz
        enbYaz(2,4);


    }public static void merhabaYaz(){
        System.out.println("Merhaba dunya");

    }
   public static int  enbBul(int a, int b){
        int donecek=0;
        if (a>b)
            donecek=a;
        else
            donecek=b;
        return donecek;// donecek deger

    }
    public static void enbYaz(int a,int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    } public static void topLamYaz(int a, int b){
        System.out.println(a+b);

    }

}
