package Gun30.FinalVariable;

public class Vatandas {
    String isim;

    final int tcNo;//degistirilemez
    // yani sadece 1 kez veri atama sansi var
    static int tcNoSayac=1;


    public Vatandas(String isim) {
        this.isim=isim;
        this.tcNo = tcNoSayac++;
        // final degiskenlerine sadece 1 kez veri atanabilir
        // oda ya tanimlarken yada Constructer da
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
