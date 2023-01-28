package Gun41;

import MyFunc.MyFunc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class A02_Soru {
    // Canli  digital saat yapiniz
    public static void main(String[] args) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true){
            LocalTime saat=LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.bekle(1);
        }

    }
}
