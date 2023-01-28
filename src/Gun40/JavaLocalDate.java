package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {
        //locaDate sadece gun ay yil bilgisini tutar
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);//tarih = 2023-01-12
        System.out.println("t = " + tarih.getYear());//t = 2023
        System.out.println("tarih.getMonth() = " + tarih.getMonth());//tarih.getMonth() = JANUARY
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());//tarih.getMonthValue() = 1
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfMonth());//tarih.getDayOfWeek() = 12
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());//tarih.getDayOfWeek() = THURSDAY
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek().getValue());//tarih.getDayOfWeek() = 4
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());//tarih.getDayOfYear() = 12

        //Kendisindeki hazir formatlar

        System.out.println("ISO_DATE= "+tarih.format(DateTimeFormatter.ISO_DATE));//ISO_DATE= 2023-01-12
        System.out.println("SHORT= "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));//SHORT= 12.01.2023
        System.out.println("MEDIUM= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));//MEDIUM= 12 Oca 2023
        System.out.println("LONG= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));//LONG= 12 Ocak 2023
        System.out.println("FULL= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));//FULL= 12 Ocak 2023 Persembe

        System.out.println("Full Almanya gosterimi= "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        //Full Almanya gosterimi= Donnerstag, 12. Januar 2023


        // lokalizasyon tanımlaması
        // en-US : birincisi DİLİ, ikncisi Ülkeyi temsil ediyor.  Amerikan ingilizcesi
        // en-UK : UK ingilizcesi
        // fr-CA :Kanada fransızcası
        // en-CA :
        // tr-TR :

        Locale[] kullanilabiliLokaller= Locale.getAvailableLocales();

        for(Locale l : kullanilabiliLokaller){
            if (l.getDisplayCountry().toLowerCase().contains("chi")) {

                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ülke = " + l.getDisplayCountry());
                System.out.print(",  " + l.getLanguage());
                System.out.println(" - " + l.getCountry());
            }
        }

        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL Çince gösterimi  =\n"+
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        //Kendimiz tarih verecegiz
        System.out.println("*****Istedigimiz formatta goster*******");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("tarih.format(ozelFormat1)(\"dd/MM/yyy\") = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih.format(ozelFormat2)(d.M.yy) = " + tarih.format(ozelFormat2));


        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE.dd.MM.yyy");
        System.out.println("tarih.format(ozelFormat3)(EEEE.dd.MM.yyy) = " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat3_1=DateTimeFormatter.ofPattern("EEEE.dd.MM.yyy");
        System.out.println("tarih.format(ozelFormat3)(EEEE.dd.MM.yyy) = " + tarih.format(ozelFormat3_1.withLocale(Locale.UK)));
         // ingilizce aldik

        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyyy");
        System.out.println("tarih.MMMM dd.MM.yyyyy= " + tarih.format(ozelFormat3));

        System.out.println("*************************");
        // Kendimiz bir tarihi nasil verebiliriz, olusturabiliriz, int sayi=5

        LocalDate tarihi=LocalDate.of(1993,07,24);
        System.out.println("tarihi = " + tarihi);
        LocalDate tarihi2=LocalDate.of(1993, Month.JULY,24);
        System.out.println("tarihi2 = " + tarihi2);
        System.out.println(String.format("tarihi2.fo = " + tarihi2.format(ozelFormat1)));
        



}}
