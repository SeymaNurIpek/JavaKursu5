package Gun34.A01_;

public class Otobus extends Arac{
    private int yolcuKapasitesi;
    public Otobus(String renk, String marka, double motorHacmi, int yolcuKapasitesi) {
        super(renk, marka, motorHacmi);
        setYolcuKapasitesi(yolcuKapasitesi);

    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "renk='" + getRenk() + '\'' +
                ", marka='" + getMarka()+ '\'' +
                ", motorHacmi=" + getMotorHacmi()+
                "yolcuKapasitesi=" + yolcuKapasitesi +
                '}';
    }
}
