package Gun27.A03_Ornek3;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)//ozellikleri kullaniyorsan normal methoddur
    {
        int suAnToplamSaat=0;
        for(Lesson d: dersleri) {
            suAnToplamSaat += d.saat;
        }
        if (suAnToplamSaat+ders.saat <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name+": Kredi sınırı aşıldı");
    }

    public void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın "+name);
        System.out.println("Aldığınız dersler aşağıdadır.");
        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);
    }
    public static void universiteKurallari(){
        System.out.println("Kural 1: Hergun Java calis");
        System.out.println("Kural 2: Hergun tekrar calis");
        System.out.println("Kural 3: Hergun tekrar tekrar calis");
    }


}
