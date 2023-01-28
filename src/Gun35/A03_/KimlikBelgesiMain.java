package Gun35.A03_;

public class KimlikBelgesiMain {
    public static void main(String[] args) {
        Kisiler calisan=new Calisan("Seyma Nur","Ipek","Ogretmen","Matematik");
        Kisiler ogrenci=new Ogrenci("Emre","ipek","ogrenci","A");
//        KimlikBelgesiOlustur(calisan);
//        KimlikBelgesiOlustur(ogrenci);
//        System.out.println("ogrenci = " + ogrenci);
//        System.out.println("calisan = " + calisan);
        Kisiler.kimlikYaz((ogrenci));
        Kisiler.kimlikYaz(calisan);
    }
//    public static void KimlikBelgesiOlustur(Kisiler kisiler) {
//        if (kisiler instanceof Calisan) {
//            System.out.println("Calisan= " + ((Calisan) kisiler));
//        }
//        if (kisiler instanceof Ogrenci) {
//            System.out.println("Ogrenci= " + (Ogrenci) kisiler);
//        }
//    }
}
