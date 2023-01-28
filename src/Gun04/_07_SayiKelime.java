package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        /*
         Suana kadarsayilari birbirine cevirdik
         yazilarin rakamlara cevrilmesi, rakamlarin yaziya cevrilmeside var
         */
        String ad="Emre";
        String kelimeSayi="65";

        int sayiDeger=Integer.parseInt(kelimeSayi);//sayiya donusur

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = "+toplam);

        //toplam suanda int sayi yani, bunu String nasil donustururum
        String strToplam=Integer.toString(toplam);//String`e donusturur
        System.out.println("strToplam = "+strToplam);

    }
}
