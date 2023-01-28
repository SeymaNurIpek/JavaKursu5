package Gun39.Soru1;

public abstract class Hayvan {
    private int id;

    private String isim;

    private boolean vahsi;
    private String dogumTarihi;


    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSurese();
    abstract void sesi();
    private static int idSayac=1;
    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = idSayac++;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    public int getId() {
        return id;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyecegi= ");yiyecegi();
        System.out.print("yemek mik= ");yemekMiktari();
        System.out.print("uyku suresi= ");gunlukUykuSurese();
        System.out.print("sesi= ");sesi();

        return "Hayvan{" +
                "id=" + id +
                ", \nisim='" + isim + '\'' +
                ", \nvahsi=" + vahsi +
                ", \ndogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
    public void guzelYaz(){
        System.out.println("id = " + id);
        System.out.println("isim = " + isim);
        System.out.println("vahsi = " + vahsi);
        System.out.print("yiyecegi= ");yiyecegi();
        System.out.print("yemek mik= ");yemekMiktari();
        System.out.print("uyku suresi= ");gunlukUykuSurese();
        System.out.print("sesi= ");sesi();

    }
}
