package Gun34.A03_;

public class IlkOgrenci extends Ogrenci {
    private String klup;
    private static int ilkIdSayac=1;
    public IlkOgrenci(String isim, OgrTip tipi, String klup) {
        super(isim, tipi, ilkIdSayac++);
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
