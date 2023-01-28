package Gun39.Soru1;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balik");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100 g");
    }

    @Override
    void gunlukUykuSurese() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
