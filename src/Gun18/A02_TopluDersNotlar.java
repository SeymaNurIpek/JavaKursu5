package Gun18;

import java.util.Scanner;

public class A02_TopluDersNotlar {
    public static void main(String[] args) {

        int sayi = 0;

        int[] dizi = new int[100];// 100 sayi

        int[] ders1Notlari = new int[50];
        int[] ders2Notlari = new int[50];
        int[] ders3Notlari = new int[50];

        int[][] tummDersNotlari=new  int[3][50];//3 tane ders 50 ogrenci, 150 sayi
        //3 satir 50 sutun
        //her satir 50 tane sayi,50 sutun
        //0. satir  1. satir  2. satir
        //satir=0,1,2    sutun=0,1,2,3,4,5,....49

        ders1Notlari[0]=80;// tek boyutlari ilk(0) elemanina 80 degerini atadim
        tummDersNotlari[0][0]=80; // 2. boyutlu dizide 0. satirda .. sutununa 80 degeri atandi
        System.out.println("tummDersNotlari[0][0]= "+tummDersNotlari[0][0]);

        Scanner scan= new Scanner(System.in);
        tummDersNotlari[0][0]=scan.nextInt();
    }
}