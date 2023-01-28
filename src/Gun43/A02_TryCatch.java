package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class A02_TryCatch {
    public static void main(String[] args) {
        System.out.println("Program calisti");
        try {
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        }// hata oldugu zaman programi kirma
        catch (Exception ex)
              // ex isimli degiskende olusan hatalarin bilgisi ataniyor
        {// hata olustugunda yapilmasi istenenler buraya yaziliyor
            System.out.println("hata olustu , lutfen tekrar deneyiniz");
            System.out.println("Tum hata mesaji= "+ex);
            System.out.println("Hatanin aciklamasi= "+ex.getMessage());
            /*
            hata mesajini kendine atabilirin
            long tutma: program nasil calisiyor, hata loglarini harddiske yazabilirsin
             */
        }
        System.out.println("prgram bitti");
    }
}
