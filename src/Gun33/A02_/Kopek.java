package Gun33.A02_;

public class Kopek extends Hayvan {
    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Havladi");
    }
}
