package Gun13;

import java.util.Scanner;

public class A01_AyNoIsteme {
    public static void main(String[] args) {
        /*
        Girilen ay numarasina gore ayin kac gun surdugunu yazdiriniz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi  giriniz");
        int no=scan.nextInt();

        switch (no) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println("28 veya 29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz");
        }
    }
}
