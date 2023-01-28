package Gun17;

public class A04_CharVeString {
    public static void main(String[] args) {
        /*
        ascii tablosu
         */

        int sayi=65;

        System.out.println("sayi= "+sayi);

        char harf=(char) sayi;
        System.out.println("HArf= "+harf);

        sayi+=32;
        harf=(char) sayi;

        System.out.println("harf= "+harf);

        for (int i = 0; i <=255 ; i++) {
            harf=(char)i;
            System.out.println(i+ " harf= "+harf);

        }


    }
}
