package Gun17;

import java.util.Scanner;

public class A02_KacKelime {
    public static void main(String[] args) {
        /*
        Kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz
        for dongusu ile
        ornek:
        Bugun hava cok guzel->4
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        int boslukSayisi=0;

        for (int i = 0; i <cumle.length(); i++) {
            if (cumle.charAt(i)==' ')
                boslukSayisi++;
        }
        System.out.println("Kelime sayisi= "+(boslukSayisi+1));
    }
}
