package Gun39.Soru5_1;

public class Borsh implements IFood {
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 33;
    }

    void  boil(){
        System.out.println("Kisit ateste kaynatiliyor ");
    }
    void eatTomarrrow(){
        System.out.println("Bir gun sonra servis edilir");
    }
}
