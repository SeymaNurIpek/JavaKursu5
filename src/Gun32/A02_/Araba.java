package Gun32.A02_;

public class Araba {
    private String renk;
    private  int model;
    private  double motorHacmi;
    private  int kapiSayisi;

    public Araba() {
    }

    public Araba(String renk, int model, double motorHacmi, int kapiSayisi) {
       setModel(model);
       setRenk(renk);
       setKapiSayisi(kapiSayisi);
       setMotorHacmi(motorHacmi);
//        this.renk = renk;
//        this.model = model;
//        this.motorHacmi = motorHacmi;
//        this.kapiSayisi = kapiSayisi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model<2023)
        this.model = model;
        else
            System.out.println("Hatali model");
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi<7)
        this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Hatali kapi sayisi");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
