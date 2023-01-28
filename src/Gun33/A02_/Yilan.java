package Gun33.A02_;

public class Yilan extends Hayvan{
    private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi, int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);

    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("tisladi");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        if (uzunluk>0){
            this.uzunluk=uzunluk;
        }

    }
}
