package Gun10;

import java.util.Scanner;

public class A05_Soru {
    public static void main(String[] args) {
        /*
          Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
         "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
         hayır yazdırınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String  metin=scan.nextLine();

        if (metin.length()>10 && metin.toLowerCase().contains("study")){
            System.out.println("evet");
        }else {
            System.out.println("hayir");
        }

    }
}
