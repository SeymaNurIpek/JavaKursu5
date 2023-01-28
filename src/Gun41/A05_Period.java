package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class A05_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasindaki farki gosterir
        // sadece LocalDate icin kullanilir

        LocalDate dogumTarihi=LocalDate.of(1993,2,3);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println(fark.getYears()+ " yasindasiniz");

        ///*********************************
        System.out.println("****************");
        Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);
        
        LocalDate ucGunSonra=bugun.plus(period3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);
        LocalDate ucAySonra=bugun.plus(period3ay);
        System.out.println("ucAySonra = " + ucAySonra);
        
        
        // Kursun bitis tarihini bulunuz
        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofDays(6);
        LocalDate kursBitis=kursBaslangic.plus((kursSure));

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitisgetDayOfWeek() = " + kursBitis.getDayOfWeek());
        
        //Kursun bitmesine ne kadar kaldi
        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        
        //Kurs ne kadar suredir devam ediyor
        Period suAnaKadarDevamSuresi=Period.between(kursBaslangic,bugun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);



    }
}
