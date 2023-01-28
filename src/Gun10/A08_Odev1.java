package Gun10;

import java.util.Scanner;

public class A08_Odev1 {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayıları 1 bosluk bırakarak 3 int sayi giriniz giriniz=");
        String sayilar=oku.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        int boslukIndex2=sayilar.lastIndexOf(" ");
        String strSayi1=sayilar.substring(0,boslukIndex); // "45"
        String strSayi2=sayilar.substring(boslukIndex+1,boslukIndex2); // "67"
        String strSayi3=sayilar.substring(boslukIndex+1); // "123

        int sayi1= Integer.parseInt(strSayi1); // 45
        int sayi2= Integer.parseInt(strSayi2); // 67
        int sayi3= Integer.parseInt(strSayi2); // 123
        int toplam=(sayi1+sayi2+sayi3);

        if (toplam%2==0){
            System.out.println("Cift");
        }
        else {
            System.out.println("tek");
        }






    }
}
