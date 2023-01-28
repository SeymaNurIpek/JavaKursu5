package Gun35.A03_;

public class Calisan extends Kisiler{
       private String departmani;
    public Calisan(String ad, String soyAd, String gorevi, String departmani) {
        super(ad, soyAd, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "ad='" + getAd() + '\'' +
                ", soyAd='" + getSoyAd() + '\'' +
                ", gorevi='" + getGorevi() + '\'' +
                "departmani='" + departmani + '\'' +
                '}';
    }
}
