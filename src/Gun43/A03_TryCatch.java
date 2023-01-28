package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A03_TryCatch {
    public static void main(String[] args) {
        System.out.println("program basladi");
        try {// hata bolgesine try{} icine aldik
            Scanner scan = new Scanner(System.in);
            System.out.println("sayi1=");
            int sayi1 = scan.nextInt();

            System.out.println("sayi2=");
            int sayi2 = scan.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
            // 0 girme hatasi

        } catch (InputMismatchException ex) {// belirli bir hata //Giriş Uyuşmazlığı İstisnası
            System.out.println("Lutfen sayi giriniz");

        }
        catch (ArithmeticException ex) {// belirli bir hata //Aritmetik İstisna
            System.out.println("0`a bolme hatasi");

        }
        catch (Exception ex) {// yukaridakilerin disinda bir hata//İstisna
            System.out.println("Hata olustu= "+ex.getMessage());

        }
        System.out.println("program bitti");
    }
}
