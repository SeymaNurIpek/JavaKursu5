package Gun32.A01_Encapsulation;

public class Kisi {
     private String ad;
     private String soyAd;
    private int yas;//korumaya aldim


     void yasAta(int yas){
         if(yas>0 && yas<150)
            this.yas=yas;
         else
             System.out.println("Hatali yas");
     }
     int yasVer(){
         return this.yas;
     }
     void setSoyad(String soyAd){
         if (soyAd.length()<25)
             this.soyAd=soyAd;
         else
             System.out.println("hatali soyad");
     }
     String getSoyAd(){
         return this.soyAd;
     }
    void setAd(String ad){
        if (ad.length()<25)
            this.ad=ad;
        else
            System.out.println("hatali ad");
    }
    String getAd(){
        return this.ad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyisim='" + soyAd + '\'' +
                ", yas=" + yas +
                '}';
    }
}
