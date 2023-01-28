package Gun37.A01_soru1;

public class TeslaCar extends Vehicle implements IElectric {
    public TeslaCar(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelligi var";
    }
}
