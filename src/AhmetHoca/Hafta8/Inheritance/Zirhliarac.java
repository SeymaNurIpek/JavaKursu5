package AhmetHoca.Hafta8.Inheritance;

public class Zirhliarac {
    private String name;
    private String fuelType;
    private int range;
    private boolean hasPalette;

    public Zirhliarac(String name, String fuelType, int range, boolean hasPalette) {
       setName(name);
       setFuelType(fuelType);
       setRange(range);
       setHasPalette(hasPalette);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        if (range<500){
            throw new IllegalArgumentException("Bu deger atanamaz");
        }
        this.range = range;
    }

    public boolean isHasPalette() {
        return hasPalette;
    }

    public void setHasPalette(boolean hasPalette) {
        this.hasPalette = hasPalette;
    }

    @Override
    public String toString() {
        return "Zirhliarac{" +
                "name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", range=" + range +
                ", hasPalette=" + hasPalette +
                '}';
    }
}
