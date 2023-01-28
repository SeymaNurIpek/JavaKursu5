package Gun12;

import java.util.Scanner;

public class A05_SwitchSoru2 {
    public static void main(String[] args) {
        //daha once cozdugunuz hesap makinesi sorusunu switch ile cozunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayi=");
        int sayi1=scan.nextInt();
        System.out.print("Ikincici sayi=");
        int sayi2=scan.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");

        System.out.println("Seciminiz");
        Scanner scanStr=new Scanner(System.in);
        String  secim=scanStr.next();

        switch ((secim.toUpperCase())){
            case  "T": System.out.println("Toplam= "+(sayi1+sayi2));break;
            case "C":System.out.println("Farki= "+(sayi1-sayi2));break;
            case "P":System.out.println("Carpimi= "+(sayi1*sayi2));break;
            case "B":System.out.println("Carpimi= "+((double)sayi1/sayi2));break;
            default: System.out.println("HAtali giris");
        }
    }
}
