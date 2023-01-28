package Gun34.A02_;

public class IlkOgrenci extends Ogrenci{
    private String klup;
    public IlkOgrenci(String isim, OgrTip tipi,String klup) {
        super(isim, tipi);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return "IlkOgrenci{" +
                "id=" + getId() +
                ", isim='" + getIsim() + '\'' +
                ", tipi=" + getTipi() +
                "klup='" + klup + '\'' +
                '}';
    }
}
