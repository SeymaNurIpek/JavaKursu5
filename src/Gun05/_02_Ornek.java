package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adi ekrana yazdirin
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz: ");
        String ad=okuyucu.nextLine();
        System.out.println("adiniz= "+ad);
    }
}
