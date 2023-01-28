package Gun39.Soru5;

public class Palov implements IFood{
    @Override
    public void taste() {
        System.out.println("Nefis bir Palov");
    }

    @Override
    public double ucret() {
        return 44;
    }
    void fry(){
        System.out.println("Kizartildi");
    }
    void boil(){
        System.out.println("Kayniyor pismek uzere");
    }
}
