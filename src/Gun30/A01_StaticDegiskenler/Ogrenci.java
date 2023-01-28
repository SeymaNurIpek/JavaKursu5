package Gun30.A01_StaticDegiskenler;

public class Ogrenci {
    String ad;
    String soyad;
   static String okulAd="Yildirim Ilkokulu";
  //sen birtanesin static degiskenler 1 tane
    // sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public  Ogrenci(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;



    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
