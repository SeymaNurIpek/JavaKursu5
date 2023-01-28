package Gun37.A01_soru1;

public class ToyotaPirus extends Vehicle implements IElectric, IGas {
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }


    public String changeBattery() {
        return "Omur boyu Kullan";
    }

    @Override
    public String changeOil() {
         return "bir depo ile300km gider";
    }

    @Override
    public String drive() {
          return "ilk 3 km elektrik ilegider";
    }
}
