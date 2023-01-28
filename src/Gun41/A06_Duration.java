package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A06_Duration {
    public static void main(String[] args) {
        //Duration: hem LocalTeim hemde LocalDateTime da kullanilir aradaki sureyi verir
        
        // LocalTime:
        LocalTime dersBaslangic=LocalTime.of(17,0,0);
        LocalTime derBitis=LocalTime.of(20,0,0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,derBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);//PT3H yani 3saat

        System.out.println("toHours() = " + GunlukDersSuresi.toHours());//farkin toplam saat
        System.out.println("toMinutes() = " + GunlukDersSuresi.toMinutes());// toplam dk
        System.out.println("toMillis()= " + GunlukDersSuresi.toMillis());//toplam millisaniyeHali

        //LocaDateTime***** 2 tarih-saat arasindaki fark*******
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();// bugun
        
        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);// saat ve dk saniye cinsinden verdi

        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes()= " + farkZaman.toMinutes());

    }
}
