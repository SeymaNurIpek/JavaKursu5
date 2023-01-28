package Gun14;

import java.util.Scanner;

public class A09_String {
    public static void main(String[] args) {
        /*
        Girilen bir stringin harflerini teker teker
        ekrana alt alta olacak sekilde yazdirin bosluklari yazmasin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");

        String  metin=scan.nextLine();

        for (int i = 0; i <metin.length(); i++) {


            if (metin.charAt(i)==' ')
                continue;
            System.out.println(metin.charAt(i));

        }

    }
}
