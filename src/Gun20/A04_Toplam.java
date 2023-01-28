package Gun20;

import java.util.Scanner;

public class A04_Toplam {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz= ");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz= ");
        int sayi2=scan.nextInt();

        int toplam=toplaminiBulma(sayi1,sayi2);
        System.out.println("Toplam= " +toplam);

    }public static int toplaminiBulma(int sayi1,int sayi2){
       // int toplam=0;
        //toplam=sayi1+sayi2;
        //return toplam;

        return (sayi1+sayi2) ;
        //seklimdede yazilabilir
    }
}
