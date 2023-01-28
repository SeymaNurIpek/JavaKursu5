package Gun37.A02_soru2;

public class Animal {
    String  turu;
    String renk;

    public Animal(String turu, String renk) {
       setRenk(renk);
       setTuru(turu);
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "turu='" + turu + '\'' +
                ", renk='" + renk + '\'' +
                '}';
    }
}
