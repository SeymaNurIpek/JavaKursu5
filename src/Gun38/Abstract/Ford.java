package Gun38.Abstract;

public class Ford extends BinekOto{
    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int HizlanmaSuresi() {
        return 0;
    }
}
