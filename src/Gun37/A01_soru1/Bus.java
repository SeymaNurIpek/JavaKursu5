package Gun37.A01_soru1;

public class Bus extends Vehicle implements IDeisel {
    public Bus(double engine, String model) {
        super(engine, model);
    }


    public String changeDiesel() {
        return "Bir depo ile 1000km gider";

    }


    public String drive() {
        return "en fazla 90km hiz yapabilir";
    }
}
