package Gun34.A01_;

public class Arac {
    private String renk,marka;

    private double motorHacmi;

    public Arac(String renk, String marka, double motorHacmi) {
       setRenk(renk);
       setMarka(marka);
       setMotorHacmi(motorHacmi);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", marka='" + marka + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}
