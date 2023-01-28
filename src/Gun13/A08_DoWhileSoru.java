package Gun13;

import java.util.Scanner;

public class A08_DoWhileSoru {
    public static void main(String[] args) {
        /*
        Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
         ve x girildiğinde ise "Program bitti" yazan programı yazınız.
         */
        Scanner scan=new Scanner(System.in);

        String metin;

        do {

            System.out.println("Bir metin giriniz");
            metin= scan.nextLine();
            System.out.println("Program calisiyor");
        }while (!metin.toUpperCase().equalsIgnoreCase("x"));
        System.out.println("Program bitti");
    }
}
