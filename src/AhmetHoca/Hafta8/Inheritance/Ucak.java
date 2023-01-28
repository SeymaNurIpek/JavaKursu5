package AhmetHoca.Hafta8.Inheritance;

public class Ucak extends Zirhliarac{
    private  int fuzeSayisi;
    public Ucak(String name, String fuelType, int range, boolean hasPalette, int fuzeSayisi) {
        super(name, fuelType, range, hasPalette);
        this.fuzeSayisi=fuzeSayisi;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "name='" + getName() + '\'' +
                ", fuelType='" + getFuelType() + '\'' +
                ", range=" + getRange() +
               // ", hasPalette=" + get +
                "fuzeSayisi=" + fuzeSayisi +
                '}';
    }
}
