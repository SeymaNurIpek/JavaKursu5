package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanicidan alinan ve string durumundaki time veya tarih bilgisine cevrilmesi

        long startTime=System.currentTimeMillis();// kodun perfonmansi icin yapiyorlar

        Scanner scan=new Scanner(System.in);
        System.out.print("Tarih giriniz(25 01 2013)= ");
        String  strTarih=scan.nextLine();

        System.out.println("strTarih = " + strTarih);

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strTarih,f);
        System.out.println("tarih = " + tarih);


        long finishTime=System.currentTimeMillis();
        System.out.println("Gecen sure= "+(finishTime-startTime)+"ms");

    }
}
