package Gun33.A02_;

public class Ordek extends Hayvan{
    private  double kanatAciligi;
    public Ordek(String renk, int kilo, String cinsi,double kanatAciligi) {
        super(renk, kilo, cinsi);

    }

    public double getKanatAciligi()
    {
        return kanatAciligi;
    }

    public void setKanatAciligi(double kanatAciligi) {
        setKanatAciligi(kanatAciligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak");
    }
}
