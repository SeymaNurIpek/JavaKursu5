package Gun35.A03_;

public class Ogrenci extends Kisiler{
    private String subesi;
    public Ogrenci(String ad, String soyAd, String gorevi, String subesi) {
        super(ad, soyAd, gorevi);setSubesi(subesi);
    }

    public String getSubesi() {return subesi;}
    public void setSubesi(String subesi) {this.subesi = subesi;}

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + getAd() + '\'' +
                ", soyAd='" + getSoyAd() + '\'' +
                ", gorevi='" + getGorevi() + '\'' +
                "subesi='" + subesi + '\'' +
                '}';
    }
}
