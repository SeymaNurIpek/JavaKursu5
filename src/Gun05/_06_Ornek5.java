package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        //Kullanicidan bir karenin bir kenar uzunlugunu isteyip alanini ve cevresini isteyin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Karenin bir kenarini yaziniz");
        double kenar=scan.nextDouble();

        System.out.println("Karenin bir kenari: "+kenar);
        System.out.println("Karenin cevresi: "+kenar*4);
        System.out.println("Karenin alani: "+kenar*kenar);
    }
}
