package Gun35.A03_;

public class Kisiler {
    private String ad, soyAd,gorevi;

    public Kisiler(String ad, String soyAd, String gorevi) {
       setAd(ad);
       setSoyAd(soyAd);
       setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static  void  kimlikYaz(Kisiler gelenKisi)// static kullandik cunku tanimlamaya gerek kalmiyor
    {
        System.out.println("******Kimlik Belgesi *******");
        System.out.println("ad= "+gelenKisi.getAd());
        System.out.println("soyad= "+gelenKisi.getSoyAd());
        System.out.println("gorevi= "+gelenKisi.getGorevi());

        if(gelenKisi instanceof Ogrenci){
            System.out.println("Subesi: "+((Ogrenci)gelenKisi).getSubesi());
        }if (gelenKisi instanceof Calisan){
        System.out.println("Departmani: "+((Calisan)gelenKisi).getDepartmani());
    }
    }
}
