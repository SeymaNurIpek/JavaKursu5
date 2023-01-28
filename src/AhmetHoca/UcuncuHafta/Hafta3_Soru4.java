package AhmetHoca.UcuncuHafta;

import java.util.Scanner;

public class Hafta3_Soru4 {
    public static void main(String[] args) {
        /*
        Verilen bir Stringin polindon olup oladigini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen nir cumle giriniz");
        String cumle=scan.nextLine();
        int cumleuzunluk=cumle.length();
        String terscumle="";
        for (int i =cumleuzunluk-1; i >=0 ; i--) {
            terscumle+=cumle.charAt(i);


            if (cumle.equalsIgnoreCase(terscumle))
                System.out.println("Polindrom");
           // else System.out.println("Polindrom degil");





        }
        Scanner oku=new Scanner(System.in);
        System.out.print("enter number or string : ");
        String value= oku.nextLine();
        boolean isPolindrome=true;
        for (int i = 0; i <(value.length()-1)/2 ; i++) {
            if (!(value.charAt(i)==value.charAt(value.length()-1-i))){
                isPolindrome=false;
                break;
            }
        }
        System.out.println("isPolindrome = " + isPolindrome);


    }
}
