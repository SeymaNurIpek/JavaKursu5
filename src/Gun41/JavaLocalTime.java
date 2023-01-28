package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalTime {
    public static void main(String[] args) {
       // LocalTime: Tarih bilsi icermez sadece saat dk, saniye , sanise(nanosaniye)Milyarda bir ddeki
        LocalTime saat=LocalTime.now();// suandaki saati ver
        System.out.println("saat = " + saat);
        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        // Kendimize ozel formatlar
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat hh:mm a = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm  = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("k:mm");
        System.out.println("saat k:mm  = " + saat.format(of3));


        //Kendimiz nasil veriyoruz
        LocalTime saat1=LocalTime.of(13,34,45);
        System.out.println("saat1 k:mm = " + saat1.format(of3));



    }
}
