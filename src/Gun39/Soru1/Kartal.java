package Gun39.Soru1;

public class Kartal extends Hayvan {
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Et");

    }

    @Override
    void yemekMiktari() {
        System.out.println("Gunluk 1kg");
    }

    @Override
    void gunlukUykuSurese() {
        System.out.println("gunde 8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyakk, fiyuuu");
    }
}
