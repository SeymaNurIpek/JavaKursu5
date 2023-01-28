package Gun42;

import java.util.Arrays;

public class A03_VeriTipleriMethodlarda {
    public static void main(String[] args) {
        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.
        // ilkel tip
        int sayi=5;
        
        sayiArrtir(sayi);
        System.out.println("sayi = " + sayi);//5
        
        sayi = sayiArrtir2(sayi);
        System.out.println("sayi = " + sayi);//6

        //referans tip
        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));//[0, 0, 0]

        //Nesne Tipler
        String  kelime="Seyma";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);//Seyma
        
    }

    private static void kelimeSifirla(String kelime) {
        kelime="";
    }

    private static void diziSifirla(int[] dizi) {//referans degerlerin kendisi gelir
        dizi[0]=0; dizi[1]=0; dizi[2]=0;
    }

    public static void sayiArrtir(int sayi){//ilkel degerlerin degeri gelir
        sayi+=1;
    }
    public static int sayiArrtir2(int sayi){//ilkel tipler aktarilan degerdir
        sayi+=1;
        return sayi;
    }
}
