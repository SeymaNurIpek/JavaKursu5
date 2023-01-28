package Gun20;

public class A06_Parametreler {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;
// ... ile ilgili 2 kural var
        // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
        // 2- Her zaman son parametre olmalı
        // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al


        int sonuc1 = toplamBul("ismet",s1, s2);
        int sonuc2 = toplamBul("Emre",s1, s2, s3);
        int sonuc3 = toplamBul("Seyma",s1, s2, s3, s4);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplamBul(String isim ,int... sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam+=sayilar[i];

        }return  toplam;
    }

    public static int toplamBul(int s1,int s2){
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static int toplamBul(int s1,int s2,int s3, int s4){
        return s1+s2+s3+s4;
    }
}
